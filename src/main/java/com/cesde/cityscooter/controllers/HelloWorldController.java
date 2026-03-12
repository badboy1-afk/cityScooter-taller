package com.cesde.cityscooter.controllers;

import com.cesde.cityscooter.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appi")

public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping("/helloworld")

    public String createGreeting(){



        return helloWorldService.createSalute();

    }



}
