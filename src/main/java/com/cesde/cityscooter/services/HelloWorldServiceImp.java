package com.cesde.cityscooter.services;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImp implements HelloWorldService {

    @Override
    public String createSalute() {
        return "Hello world From Service";
    }
}
