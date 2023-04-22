package com.example.springbootpractice.controller;

import com.example.springbootpractice.properties.MyProperties;
import com.example.springbootpractice.service.MyPropertyService;
import com.example.springbootpractice.service.SortService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.context.refresh.ContextRefresher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Package Name   : com.example.springbootpractice.controller
 * File Name      : MainController
 * Author         : jeong
 * Date           : 2023-04-11
 * Description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-04-11        jeong       최초 생성
 */
@Slf4j
@RequiredArgsConstructor
@RestController
public class MainController {
    private final SortService sortService;
    private final MyPropertyService myPropertyService;
    private final MyProperties myProperties;
    private final ContextRefresher contextRefresher;


    @GetMapping("/")
    public String hello(@RequestParam List<String> list) {
        log.info("RequestParam List : {}", list);
        return sortService.doSort(list).toString();
    }

    @GetMapping("/my-height")
    public Map<String, Integer> myHeight() {
        log.info("myHeight map" );
        return Map.of(
                "- my.height(@Value from service): ", myPropertyService.getMyHeight(),
                "- my.height(@ConfigurationProperties): ", myProperties.getHeight()
        );
    }

    @GetMapping("/refresh")
    public Map<String, Set<String>> refresh() {

        return Map.of("refreshResult", contextRefresher.refresh());
    }

}
