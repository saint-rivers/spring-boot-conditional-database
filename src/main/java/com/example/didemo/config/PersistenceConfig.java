package com.example.didemo.config;

import com.example.didemo.persistence.StudentMongoRepositoryImpl;
import com.example.didemo.persistence.StudentPostgresRepositoryImpl;
import com.example.didemo.persistence.StudentRepository;
import com.example.didemo.repository.StudentJpaRepository;
import com.example.didemo.repository.StudentMongoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class PersistenceConfig {

    private final StudentJpaRepository studentJpaRepository;
    private final StudentMongoRepository studentMongoRepository;

    @Value("${database.choice}")
    private String DATABASE_CHOICE;

    @Bean
    public StudentRepository studentRepository() {
        switch (DATABASE_CHOICE) {
            case "POSTGRES" -> {
                return new StudentPostgresRepositoryImpl(studentJpaRepository);
            }
            case "MONGO" -> {
                return new StudentMongoRepositoryImpl(studentMongoRepository);
            }
            default -> throw new IllegalStateException("please provide a proper database vendor");

        }
    }

}
