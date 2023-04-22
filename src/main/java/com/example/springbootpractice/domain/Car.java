package com.example.springbootpractice.domain;

import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * Package Name   : com.example.springbootpractice.domain
 * File Name      : Car
 * Author         : jeong
 * Date           : 2023-04-11
 * Description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-04-11        jeong       최초 생성
 */
@Data(staticConstructor = "of")
@ToString
public class Car {
    private final String name;
    private List<Seat>  seats;
}
