package com.example.springbootpractice.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

/**
 * Package Name   : com.example.springbootpractice.properties
 * File Name      : MyProperties
 * Author         : jeong
 * Date           : 2023-04-11
 * Description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-04-11        jeong       최초 생성
 */

//@RequiredArgsConstructor
@ConfigurationProperties("my")
@ConstructorBinding
@Getter
@Setter
public class MyProperties {
    private final Integer height ;

    // final 을 선언하는 경우에는 생성자를 만들어 주어야 함
    public MyProperties(Integer height) {
        this.height = height;
    }
}