package com.example.springboottutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieCatalogCtrl {

    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;

    @GetMapping("/publishMsg")
    public String publishMovie(){
        kafkaTemplate.send("MovieTopic","movieName","new intersteller movie releases");
        return "New movie is released";
    }
}
