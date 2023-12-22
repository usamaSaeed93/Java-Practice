package com.springBoot.tutorialOne.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach coach;

    @Autowired

    public DemoController(Coach coach) {
        this.coach = coach;
    }

    @GetMapping(path = "/daily-workout")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }

}
