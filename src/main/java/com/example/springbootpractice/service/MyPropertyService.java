package com.example.springbootpractice.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

/**
 * Package Name   : com.example.springbootpractice.service
 * File Name      : MyPropertyService
 * Author         : jeong
 * Date           : 2023-04-11
 * Description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-04-11        jeong       최초 생성
 */
@RefreshScope
@Service
public class MyPropertyService {

    private final Integer height;

    public MyPropertyService(@Value("${my.height}") Integer height) {
        this.height = height;
    }

    public Integer getMyHeight() {
        return height;
    }
}
