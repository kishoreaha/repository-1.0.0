package com.example.springboottutorial.controller;

import com.example.springboottutorial.service.JpaQueriesDemoService;
import com.example.springboottutorial.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;

public class JpaQueriesDemoController {

    @Autowired
    JpaQueriesDemoService jpaQueriesDemoService;
}
