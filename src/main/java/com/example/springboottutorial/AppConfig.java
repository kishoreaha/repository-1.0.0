package com.example.springboottutorial;

import com.example.springboottutorial.service.SpeakerService;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

//    @Bean
//    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
//    public SpeakerService getSpeaker(){
//        return new SpeakerServiceImpl();
//    }
}
