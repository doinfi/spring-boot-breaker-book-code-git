package com.jack.person;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author yangyueming
 */
@SpringBootApplication
@EnableEurekaClient
public class PersonApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonApplication.class, args);
    }

}
