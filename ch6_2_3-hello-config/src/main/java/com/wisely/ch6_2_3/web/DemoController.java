package com.wisely.ch6_2_3.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangyueming
 */
@RestController
public class DemoController {

    @RequestMapping("/")
    String index() {
        return "hello spring boot";
    }
}
