package com.broker.jsonprocessoradmin.repositories;

import com.broker.jsonprocessoradmin.entities.JoltSpec;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface JoltSpecRepository extends MongoRepository<JoltSpec, String> {
    
}
