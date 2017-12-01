package com.wisely.ch7_7.web;

import com.wisely.ch7_7.entity.Person;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ch77Controller {

    @RequestMapping(value = "/search", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Person search(String personName) {
        return new Person(personName, 32, "hefei");
    }
}
