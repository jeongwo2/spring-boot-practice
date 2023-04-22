package com.example.springbootpractice.domain;

import lombok.AllArgsConstructor;
import lombok.ToString;

/**
 * Package Name   : com.example.springbootpractice.domain
 * File Name      : Seat
 * Author         : jeong
 * Date           : 2023-04-11
 * Description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-04-11        jeong       최초 생성
 */
@AllArgsConstructor(staticName = "of")
@ToString
public class Seat {
    @ToString.Exclude private final Car car;
}
