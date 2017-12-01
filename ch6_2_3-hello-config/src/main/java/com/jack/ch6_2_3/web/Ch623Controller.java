package com.jack.ch6_2_3.web;

import com.jack.ch6_2_3.config.AuthorSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ch623Controller {

    @Autowired
    private AuthorSettings authorSettings; //1

    @RequestMapping("/2")
    public String index() {
        return "author name is " + authorSettings.getName() + " and author age is " + authorSettings
            .getAge();
    }
}
