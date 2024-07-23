package com.ProjectOne.DemoProject;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    private Coach theCoach;

    @Autowired
    public FunRestController(Coach theCoach)
    {
        this.theCoach=theCoach;

    }

    @GetMapping("/")
    public String workout()
    {
        return theCoach.getDailyworkout();
    }


//    @GetMapping("/")
//            public String sayHello()
//            {
//                return "Hello world guys";
//            }


    //expose a new end point

//    @GetMapping("/workout")
//    public String run()
//    {
//        return "running 5 km";
//    }


}
