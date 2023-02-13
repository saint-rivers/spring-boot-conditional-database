package com.example.didemo.persistence;

import com.example.didemo.model.StudentMongoEntity;
import com.example.didemo.repository.StudentMongoRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class StudentMongoRepositoryImpl implements StudentRepository {

    private final StudentMongoRepository studentMongoRepository;

    @Override
    public String insertStudent(String studentName) {
        return studentMongoRepository.save(new StudentMongoEntity(null, studentName)).getStudentName();
    }

    @Override
    public List<String> getAllStudents() {
        return studentMongoRepository.findAll().stream().map(StudentMongoEntity::getStudentName).toList();
    }
}
