package com.company;


import org.springframework.stereotype.Component;

@Component("theSillyCoach")   //bean Id
public class TennisCoach implements ICoach {
    @Override
    public String GetDailyWorkout() {
        return "practice your backend volley";
    }
}
