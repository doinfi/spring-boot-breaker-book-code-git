package com.jack.ch10.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangyueming
 */
@RestController
public class DemoController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

}
