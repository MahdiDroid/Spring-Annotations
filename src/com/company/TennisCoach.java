package com.company;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component()   //bean Id  default bean Id is classname  start with lower case.
public class TennisCoach implements ICoach {

    private FortuneService fortuneService;

    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune()   ;
    }

    @Override
    public String GetDailyWorkout() {

        return "practice your backend volley";
    }
}
