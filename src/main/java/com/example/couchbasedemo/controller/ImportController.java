package com.example.couchbasedemo.controller;

import com.example.couchbasedemo.service.ScheduleImportService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/import")
public class ImportController {

    private final ScheduleImportService importService;

    public ImportController(ScheduleImportService importService) {
        this.importService = importService;
    }

    @PostMapping("/schedules")
    public Mono<ResponseEntity<String>> importSchedules() {
        return importService.importSchedulesReactive()
                .thenReturn(ResponseEntity.ok("Schedules imported successfully"))
                .onErrorResume(e -> Mono.just(
                        ResponseEntity.status(500)
                                .body("Error importing schedules: " + e.getMessage())
                ));
    }
}