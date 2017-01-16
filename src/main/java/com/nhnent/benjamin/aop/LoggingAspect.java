package com.nhnent.benjamin.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by benjamin on 2017. 1. 17..
 */
@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* getMember(..))")
    public void before() {
        System.out.println("Start Method! >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> ");
    }
}
