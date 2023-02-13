package com.example.didemo.persistence;

import java.util.List;

public interface StudentRepository {
    String insertStudent(String studentName);
    List<String> getAllStudents();
}
