package com.jack.highlight_springmvc4.web.ch4_3;

import com.jack.highlight_springmvc4.domain.DemoObj;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController // 1
@RequestMapping("/anno") //2
public class DemoAnnoController {
    @RequestMapping(produces = "text/plain;charset=UTF-8")    // 3
    public String index(HttpServletRequest request) { // 4
        return "url:" + request.getRequestURL() + " can access";
    }

    @RequestMapping(value = "/pathvar/{str}", produces = "text/plain;charset=UTF-8")// 5
    public String demoPathVar(@PathVariable String str, //3
        HttpServletRequest request) {
        return "url:" + request.getRequestURL() + " can access,str: " + str;
    }

    @RequestMapping(value = "/requestParam", produces = "text/plain;charset=UTF-8") //6
    public String passRequestParam(Long id, HttpServletRequest request) {
        return "url:" + request.getRequestURL() + " can access,id: " + id;
    }

    @RequestMapping(value = "/obj", produces = "application/json;charset=UTF-8")//7
    public String passObj(DemoObj obj, HttpServletRequest request) {
        return "url:" + request.getRequestURL()
            + " can access, obj id: " + obj.getId() + " obj name:" + obj.getName();

    }

    @RequestMapping(value = {"/name1", "/name2"}, produces = "text/plain;charset=UTF-8")//9
    public String remove(HttpServletRequest request) {
        return "url:" + request.getRequestURL() + " can access";
    }

}
