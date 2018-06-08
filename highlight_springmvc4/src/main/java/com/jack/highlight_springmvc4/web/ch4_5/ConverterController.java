package com.jack.highlight_springmvc4.web.ch4_5;

import com.jack.highlight_springmvc4.domain.DemoObj;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConverterController {

    @RequestMapping(value = "/convert", produces = {"application/x-jack"}) //1
    public DemoObj convert(@RequestBody DemoObj demoObj) {

        return demoObj;
    }

}
