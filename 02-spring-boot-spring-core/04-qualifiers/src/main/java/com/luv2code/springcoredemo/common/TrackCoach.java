package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        // TODO Auto-generated method stub
        return "Run a hard 5K!";
    }

}
