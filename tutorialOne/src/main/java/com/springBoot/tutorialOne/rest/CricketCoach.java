package com.springBoot.tutorialOne.rest;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CricketCoach implements Coach {
    @PostConstruct
    public void constructFunction() {
        System.out.println("Bean declaration function" + getClass().getSimpleName());
    }

    @PreDestroy
    public void destructFunction() {
        System.out.println("Bean deletion function" + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Kindly exercise for 15 minutes update!!!!!";
    }
}
