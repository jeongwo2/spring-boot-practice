package com.example.springbootpractice.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.boot.context.properties.bind.Name;
import org.springframework.boot.convert.DurationUnit;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

/**
 * Package Name   : com.example.springbootpractice.properties
 * File Name      : CustomProperties
 * Author         : jeong
 * Date           : 2023-04-11
 * Description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-04-11        jeong       최초 생성
 */
@ConstructorBinding
@ConfigurationProperties("iam")
public class CustomProperties {
    /**
     * 와아 이건 configuration processor 테스트
     */
    private final Duration duration;

    public CustomProperties(@DefaultValue("1") @DurationUnit(ChronoUnit.MILLIS) @Name("duration") Duration duration) {
        this.duration = duration;
    }

    public Duration getDuration() {
        return duration;
    }

}