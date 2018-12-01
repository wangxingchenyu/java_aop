package com.zhileiedu.advice;

import org.springframework.aop.MethodBeforeAdvice;
import sun.java2d.pipe.ShapeDrawPipe;

import java.lang.reflect.Method;

public class MyBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("切点方法对象是:"+method);

        if (objects!=null && objects.length>0){
            System.out.println(objects[0]);
        }else{
            System.out.println("该切点的方法没有参数");
        }

        System.out.println("切点的类的对像:"+o);

        System.out.println("我是前切面的方法");
    }

}



