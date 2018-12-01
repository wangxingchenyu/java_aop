package com.zhileiedu.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class MyAfterAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        if (returnValue!=null){
            System.out.println("方法的返回值是:"+returnValue);
        }else{
            System.out.println("该方法没有返回值");
        }

        System.out.println("我的后切面的方法");
    }
}
