package com.jack.highlight_spring4.ch2.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {

    public JSR250WayService() {
        super();
        System.out.println("��ʼ�����캯��-JSR250WayService");
    }

    @PostConstruct //1
    public void init() {
        System.out.println("jsr250-init-method");
    }

    @PreDestroy //2
    public void destroy() {
        System.out.println("jsr250-destory-method");
    }

}
