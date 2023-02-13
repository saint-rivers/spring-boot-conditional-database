package com.example.didemo.config;

import com.example.didemo.persistence.StudentRepository;
import com.example.didemo.service.StudentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public StudentService studentService(StudentRepository studentRepository){
        return new StudentService(studentRepository);
    }
}
