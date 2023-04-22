package com.example.springbootpractice.service;

import com.example.springbootpractice.logic.Sort;
import com.example.springbootpractice.properties.CustomProperties;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Package Name   : com.example.springbootpractice.service
 * File Name      : SortService
 * Author         : jeong
 * Date           : 2023-04-11
 * Description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-04-11        jeong       최초 생성
 */
@Slf4j
@Service
public class SortService {
    private final Sort<String> sort;

    @Autowired  // Spring 4.3 부터는 생략 가능
    public SortService(@Qualifier("bubbleSort") Sort<String> sort,
                       CustomProperties customProperties) {
        log.info("Properties: " + customProperties.getDuration().toMillis() + " ms");
        log.info("embodiment: " + sort.getClass().getName());
        this.sort = sort;
    }
    public List<String> doSort(List<String> list) {
        return sort.sort(list);
    }

}
