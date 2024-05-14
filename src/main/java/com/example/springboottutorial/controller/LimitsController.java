package com.example.springboottutorial.controller;

import com.example.springboottutorial.configuration.LimitsConfiguration;
import com.example.springboottutorial.model.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    LimitsConfiguration limitConfigProp;

    @GetMapping("/getlimits")
    public Limits retrieveLimits(){
//    return new Limits(1,1000);
        return new Limits(limitConfigProp.getMinimum(),limitConfigProp.getMaximum());
    }
}
