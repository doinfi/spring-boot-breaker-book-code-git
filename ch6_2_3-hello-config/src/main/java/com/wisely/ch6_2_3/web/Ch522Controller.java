package com.wisely.ch6_2_3.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangyueming
 */
@RestController
public class Ch522Controller {

    @Value("${book.author}")
    private String bookAuthor;
    @Value("${book.name}")
    private String bookName;

    @RequestMapping("/1")
    String index() {
        return "book name is:" + bookName + " and book author is:" + bookAuthor;
    }
}
