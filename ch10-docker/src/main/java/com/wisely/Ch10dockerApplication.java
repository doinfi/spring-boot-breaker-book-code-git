package com.wisely;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangyueming
 */
@SpringBootApplication
@RestController
public class Ch10dockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch10dockerApplication.class, args);
    }

    @RequestMapping("/")
    public String home() {
        return "Hello Docker!!";
    }
}
