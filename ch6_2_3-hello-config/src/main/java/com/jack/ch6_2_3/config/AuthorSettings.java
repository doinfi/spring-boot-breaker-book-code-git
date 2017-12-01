package com.jack.ch6_2_3.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "author") //1
@Data
public class AuthorSettings {

    private String name;
    private Long age;
}