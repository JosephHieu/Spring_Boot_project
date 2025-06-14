package com.luv2code.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springcoredemo.common.Coach;

@RestController
public class DemoController {

    // define a private field for the dependency
    private Coach myCoach;
    private Coach anotherCoach;

    // define a constructor for dependency injection

    @Autowired
    public DemoController (@Qualifier("crickedCoach") Coach theCoach,
                           @Qualifier("crickedCoach") Coach anotherCoach) {

        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
        this.anotherCoach = anotherCoach;
    }

    // define a setter for dependency injection
    // @Autowired
    // public void doSomeStuff(Coach theCoach) {
    //     myCoach = theCoach;
    // }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {

        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check() {
        return "Comparing beans: myCoach == anotherCoach, " + (myCoach == anotherCoach);
    }

}
