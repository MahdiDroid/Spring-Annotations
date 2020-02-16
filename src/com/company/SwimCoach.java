package com.company;

public class SwimCoach implements ICoach{

    private IFortuneService fortuneService;

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
}
