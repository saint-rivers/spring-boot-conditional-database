package com.example.didemo.service;

import com.example.didemo.persistence.StudentRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public String post(String studentName) {
        return studentRepository.insertStudent(studentName);
    }

    public List<String> get() {
        return studentRepository.getAllStudents();
    }
}
