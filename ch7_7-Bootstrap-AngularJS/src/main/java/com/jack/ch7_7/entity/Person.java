package com.jack.ch7_7.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yangyueming
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private String name;
    private Integer age;
    private String address;
}
