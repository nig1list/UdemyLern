package com.udemy.learn.UdemyLern;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    //array of strings
    public String[] data ={"Great day", "Lucky Day" , "Tiring Day" };
    //Random creation
    Random random = new Random();

    public String getFortune() {
        int number = random.nextInt(data.length);
        String theFortune = data[number];
        return theFortune;
    }

}