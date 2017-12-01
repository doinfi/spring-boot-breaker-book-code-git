package com.jack.ch6_4.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangyueming
 */
@RestController
public class Ch64Controller {


    @RequestMapping("/")
    String index() {
        return "hello";
    }
}
