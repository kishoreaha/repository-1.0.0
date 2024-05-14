package com.example.springboottutorial.service.impl;

//import com.example.springboottutorial.repository.H2TestDBEntityRepository;
import com.example.springboottutorial.model.Speaker;
import com.example.springboottutorial.model.Test;
import com.example.springboottutorial.model.Tutorial;
import com.example.springboottutorial.repository.TestRepository;
//import com.example.springboottutorial.service.H2TestDBEntityService;
import com.example.springboottutorial.repository.TutorialRepository;
import com.example.springboottutorial.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    TestRepository repo ;


//    @Autowired
//    TutorialRepository tutorialRepository ;
//
//    @Transactional
    public void speak(String text) {
//
        Tutorial tutorial = new Tutorial("SpringDataJPA","SpringDataJPA",0,true,new Date());
//        Tutorial savedTut = tutorialRepository.save(tutorial); // JPA
//
//        Tutorial tutWithIdOne = tutorialRepository.findById(1L).get(); //JPA
//
//        if(tutWithIdOne.getId() == savedTut.getId()) {
//            System.out.println("Simple Check-------------------------->>>" + savedTut);
//            tutWithIdOne.setTitle("SpringBoot");  //Boot
//            System.out.println("---->>>>" + tutWithIdOne.getTitle() + " " + savedTut.getTitle());
//
//            tutorialRepository.save(tutWithIdOne);
//        }
//
//
//
//        List<Tutorial> tutorials = tutorialRepository.findAll();
//
//        System.out.println(tutorials);
////
////        repo.findTestById(1);
////
////        Optional<Test> result = repo.findById(1);
////
////        System.out.println("Got Entry in table ---->>>" + result.isPresent());
    }
////
//    public void save(Speaker speaker) {
//        tutorialRepository.save(speaker);
//    }
}
