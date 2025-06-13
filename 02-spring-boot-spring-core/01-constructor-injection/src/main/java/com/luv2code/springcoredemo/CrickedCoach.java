package com.luv2code.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class CrickedCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practive fast bowling for 15 minutes. NOW!!!!";
    }

    
}
