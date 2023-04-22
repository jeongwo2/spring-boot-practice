package com.example.springbootpractice.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Package Name   : com.example.springbootpractice.config
 * File Name      : DataSourceConfig
 * Author         : jeong
 * Date           : 2023-04-21
 * Description    : DataSource Config
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-04-21        jeong       최초 생성
 */
@Configuration
public class DataSourceConfig {
    private static Logger logger = LoggerFactory.getLogger(DataSourceConfig.class);
    @Bean
    public DataSource getDataSource(){
        DataSourceBuilder<?> builder = DataSourceBuilder.create();
        builder.username("sa") ;
        builder.password("");
        builder.url("jdbc:h2:mem:test");
        builder.driverClassName("org.h2.Driver");

        return builder.build();
    }
}
