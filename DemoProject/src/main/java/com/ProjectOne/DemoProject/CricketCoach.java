package com.ProjectOne.DemoProject;


import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class CricketCoach implements Coach{

    public CricketCoach()
    {
        System.out.println("In constructor");
    }

    @Override
    public String getDailyworkout(){
        return "Practice bowling for 15mins";
    }
}
