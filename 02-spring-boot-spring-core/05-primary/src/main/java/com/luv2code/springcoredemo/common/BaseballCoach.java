package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        // TODO Auto-generated method stub
        return "Spend 30 minutes in batting practice.";
    }

}
