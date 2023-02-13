package com.example.didemo.repository;

import com.example.didemo.model.StudentJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentJpaRepository extends JpaRepository<StudentJpaEntity, Long> {
}
