package com.example.couchbasedemo.service;

import com.example.couchbasedemo.model.NodeTransfer;
import com.example.couchbasedemo.model.NodeTransferSchedule;
import com.example.couchbasedemo.repo.NodeTransferScheduleRepository;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.couchbase.client.java.Cluster;
import com.couchbase.client.java.json.JsonObject;
import com.couchbase.client.java.ReactiveCollection;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.io.File;
import java.util.UUID;

@Service
public class ScheduleImportService {

    private final NodeTransferScheduleRepository repository;
    private final XmlMapper xmlMapper;
    private final ObjectMapper objectMapper;
    private final Cluster cluster;

    @Value("${spring.couchbase.bucket.name}")
    private String bucketName;

    public ScheduleImportService(
            NodeTransferScheduleRepository repository,
            ObjectMapper objectMapper,
            Cluster cluster
    ) {
        this.repository = repository;
        this.xmlMapper = new XmlMapper();
        this.objectMapper = objectMapper;
        this.cluster = cluster;
    }

    /**
     * Reactive import with chained write → read → secondary insert:
     *  1) Save into default collection
     *  2) Read back and log XML key
     *  3) Insert into second_coll in test scope
     */
    public Mono<Void> importSchedulesReactive() {
        return Mono.fromCallable(() -> {
                    File file = new ClassPathResource("schedules.xml").getFile();
                    return xmlMapper.readValue(file, NodeTransfer.class);
                })
                .flatMapMany(transfer -> Flux.fromIterable(transfer.getSchedules()))
                .flatMap(schedule -> {
                    schedule.setId(UUID.randomUUID().toString());
                    return repository.save(schedule)
                            .flatMap(saved -> repository.findById(saved.getId())
                                    .flatMap(loaded -> {
                                        // Log the original XML key
                                        System.out.println("✔ Wrote & read key: "
                                                + loaded.getNodeTransferScheduleKey());
                                        // Reactive insert into 'second_coll'
                                        ReactiveCollection rc = cluster
                                                .bucket(bucketName)
                                                .scope("test")
                                                .collection("second_coll")
                                                .reactive();
                                        // Convert to JSON and insert, handling possible JsonProcessingException
                                        return Mono.defer(() -> {
                                            try {
                                                String json = objectMapper.writeValueAsString(loaded);
                                                JsonObject content = JsonObject.fromJson(json);
                                                return rc.insert(loaded.getId(), content).then();
                                            } catch (com.fasterxml.jackson.core.JsonProcessingException e) {
                                                return Mono.error(e);
                                            }
                                        });
                                    })
                            );
                })
                .then();
    }
}
