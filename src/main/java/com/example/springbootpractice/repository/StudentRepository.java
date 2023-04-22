package com.example.springbootpractice.repository;

import com.example.springbootpractice.domain.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.nativex.hint.AotProxyHint;
import org.springframework.nativex.hint.ProxyBits;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Package Name   : com.example.springbootpractice.config
 * File Name      : StudentRepository
 * Author         : jeong
 * Date           : 2023-04-11
 * Description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-04-11        jeong       최초 생성
 */
@AotProxyHint(targetClass= StudentRepository.class, proxyFeatures = ProxyBits.IS_STATIC)
@RequiredArgsConstructor
@Component
public class StudentRepository {

    private final Map<String, Student> storage;

    @Cacheable("student")
    public Student getStudent(String name) {
        System.out.println("[repo] 나의 통행료는 무척 비싸다!");
        return storage.get(name);
    }

    public Student enroll(String name, Integer age, Student.Grade grade) {
        return storage.put(name, Student.of(name, age, grade));
    }

}
