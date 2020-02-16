package com.company;

public class SadFortuneService implements IFortuneService{
    @Override
    public String getFortune() {
        return "Today iis a sad day ";
    }
}
