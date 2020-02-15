package com.company;


import org.springframework.stereotype.Component;

@Component()   //bean Id  default bean Id is classname  start with lower case.
public class TennisCoach implements ICoach {
    @Override
    public String GetDailyWorkout() {
        return "practice your backend volley";
    }
}
