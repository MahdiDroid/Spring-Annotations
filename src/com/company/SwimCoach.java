package com.company;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements ICoach{

    private IFortuneService fortuneService;
    @Value("${foo.email}")
    private String email ;

    @Value("${foo.team}")
    private String team;

    public SwimCoach(IFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String GetDailyWorkout() {
        return "swim 100 meter as a warm up ";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
}
