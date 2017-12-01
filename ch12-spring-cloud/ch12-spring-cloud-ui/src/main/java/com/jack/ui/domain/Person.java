package com.jack.ui.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yangyueming
 */
@Data
@NoArgsConstructor
public class Person {

    private Long id;
    private String name;


    public Person(String name) {
        super();
        this.name = name;
    }

}
