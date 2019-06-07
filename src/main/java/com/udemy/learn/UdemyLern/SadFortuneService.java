package com.udemy.learn.UdemyLern;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("sadFortuneService")

public class SadFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is a bad day";
    }
}
