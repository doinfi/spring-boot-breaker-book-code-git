package com.jack.highlight_spring4.ch2.prepost;

public class BeanWayService {

    public BeanWayService() {
        super();
        System.out.println("��ʼ�����캯��-BeanWayService");
    }

    public void init() {
        System.out.println("@Bean-init-method");
    }

    public void destroy() {
        System.out.println("@Bean-destory-method");
    }
}
