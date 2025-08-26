package com.josephhieu.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

    // this is where we add all of our related advices for logging
    // let's start with an @Before advice
//    @Before("execution(public void add*())") // inside of @Before that is pointcut expression

//    @Before("execution(* add*(com.josephhieu.aopdemo.Account))")

//    @Before("execution(* add*(com.josephhieu.aopdemo.Account, ..))")

    @Before("execution(* com.josephhieu.aopdemo.dao.*.*(..))")
    public void beforeAddAccountAdvice() {
        System.out.println("\n=====>>> Executing @Before on advice on method");
    }
}
