package com.example.couchbasedemo.repo;

import com.example.couchbasedemo.model.NodeTransferSchedule;
import org.springframework.data.couchbase.repository.ReactiveCouchbaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeTransferScheduleRepository
        extends ReactiveCouchbaseRepository<NodeTransferSchedule, String> { }