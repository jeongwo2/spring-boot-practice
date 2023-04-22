package com.example.springbootpractice.logic;

import java.util.List;

/**
 * Package Name   : com.example.springbootpractice.logic
 * File Name      : Sort
 * Author         : jeongwoo
 * Date           : 2023-04-11
 * Description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-04-11        jeong       최초 생성
 */
public interface Sort <T extends Comparable<T>> {
    List<T> sort(List<T> list);
}
