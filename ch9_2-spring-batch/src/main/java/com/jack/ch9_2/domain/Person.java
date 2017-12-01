package com.jack.ch9_2.domain;

import javax.validation.constraints.Size;
import lombok.Data;

/**
 * @author yangyueming
 */
@Data
public class Person {

    @Size(max = 4, min = 2) //1
    private String name;
    private int age;
    private String nation;
    private String address;
}
