package com.josephhieu.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

    // this is where we add all of our related advices for logging
    // let's start with an @Before advice
    @Before("execution(public void addAccount())") // inside of @Before that is pointcut expression
    public void beforeAddAccountAdvice() {
        System.out.println("\n=====>>> Executing @Before on advice on addAccount()");
    }
}
