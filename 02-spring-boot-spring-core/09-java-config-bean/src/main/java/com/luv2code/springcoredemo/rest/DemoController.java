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

    // define a constructor for dependency injection

    @Autowired
    public DemoController (@Qualifier("aquatic") Coach theCoach) {

        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
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

    

}
