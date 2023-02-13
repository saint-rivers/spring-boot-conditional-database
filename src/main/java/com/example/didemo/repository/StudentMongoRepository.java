package com.example.didemo.repository;

import com.example.didemo.model.StudentMongoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentMongoRepository extends MongoRepository<StudentMongoEntity, String> {
}
