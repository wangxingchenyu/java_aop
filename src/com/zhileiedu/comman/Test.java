package com.zhileiedu.comman;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Demo demo = applicationContext.getBean("demo", Demo.class);
        /**
         * 通常情况下，service里面不做try catch.异常捕捉留给controller ,后期用来做事务处理
         */
        try {
            demo.demo1();
        } catch (Exception e) {
//            e.printStackTrace();
        }
    }
}
