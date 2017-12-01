package com.jack.ch10_4.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Person {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Person(String name) {
        super();
        this.name = name;
    }
}
