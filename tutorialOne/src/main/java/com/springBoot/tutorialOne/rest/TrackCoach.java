package com.springBoot.tutorialOne.rest;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "I am a track coach...";
    }
}
