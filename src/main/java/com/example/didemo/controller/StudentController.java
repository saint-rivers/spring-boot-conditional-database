package com.example.didemo.controller;

import com.example.didemo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
class StudentController {
    private final StudentService studentService;

    @GetMapping("/get")
    public List<String> getAllStudents() {
        return studentService.get();
    }

    @GetMapping("/post")
    public String registerStudent() {
        return studentService.post("Naro" + UUID.randomUUID());
    }
}
