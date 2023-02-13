package com.example.didemo.persistence;

import com.example.didemo.model.StudentJpaEntity;
import com.example.didemo.repository.StudentJpaRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class StudentPostgresRepositoryImpl implements StudentRepository {

    private final StudentJpaRepository studentJpaRepository;

    @Override
    public String insertStudent(String studentName) {
        return studentJpaRepository.save(new StudentJpaEntity(null, studentName)).getStudentName();
    }

    @Override
    public List<String> getAllStudents() {
        return studentJpaRepository.findAll().stream().map(StudentJpaEntity::getStudentName).toList();
    }
}
