package com.luv2code.util;

import org.springframework.stereotype.Component;

@Component
public class CrickedCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practive fast bowling for 15 minutes. NOW!!!!";
    }

    
}
