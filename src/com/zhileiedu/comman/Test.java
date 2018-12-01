package com.zhileiedu.comman;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Demo demo = applicationContext.getBean("demo", Demo.class);

        demo.demo1();
        System.out.println("----------------------");
        demo.demo2();
        System.out.println("----------------------");
        demo.demo3(3333333);
        System.out.println("-------------第二个能不能实现aop--------------");

        MyDemo mydemo = applicationContext.getBean("mydemo", MyDemo.class);
        mydemo.demo1();
        mydemo.demo2();
    }
}
