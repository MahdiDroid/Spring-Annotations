package com.company;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements IFortuneService{

    private String[] data = {
            " from the outside negative thoughts",
            "the journey is rewarded",
            "how about drinking"
    };
    private Random myRandom = new Random();

    @Override
    public String getFortune() {
        int index = myRandom.nextInt(data.length);
        return data[index];
    }
}
