package com.example.demo.controller;


import com.example.demo.services.GreetingService;
import org.springframework.stereotype.Controller;

import java.math.BigInteger;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){

        return greetingService.sayGreeting();
    }

}
