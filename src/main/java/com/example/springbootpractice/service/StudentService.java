package com.example.springbootpractice.service;

import com.example.springbootpractice.domain.Student;
import com.example.springbootpractice.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@RequiredArgsConstructor
@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public void printStudent(String name) {
        Student student = studentRepository.getStudent(name);
        System.out.println("찾는 학생: " + student);
    }

    @PostConstruct
    public void init() {
        studentRepository.enroll("jack", 15, Student.Grade.B);
        studentRepository.enroll("cassie", 18, Student.Grade.A);
        studentRepository.enroll("fred", 14, Student.Grade.C);
    }
}
