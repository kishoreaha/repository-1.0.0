package com.example.springboottutorial.service.impl;

//import com.example.springboottutorial.repository.H2TestDBEntityRepository;

import com.example.springboottutorial.model.Speaker;
import com.example.springboottutorial.model.Tutorial;
import com.example.springboottutorial.repository.TestRepository;
import com.example.springboottutorial.repository.TutorialRepository;
import com.example.springboottutorial.service.TestService;
import com.example.springboottutorial.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
//import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TutorialServiceImpl implements TutorialService {

    @Autowired
    TutorialRepository tutorialRepository ;



    @Transactional
    public void speak(String text) {
        Tutorial tutorial = new Tutorial("SpringDataJPA","SpringDataJPA",0,true,new Date());
        Tutorial savedTut = tutorialRepository.save(tutorial); // JPA

        Tutorial tutWithIdOne = tutorialRepository.findById(1L).get(); //JPA
        if(tutWithIdOne.getId() == savedTut.getId()) {
            System.out.println("Simple Check-------------------------->>>" + savedTut);
            tutWithIdOne.setTitle("SpringBoot");  //Boot
            System.out.println("---->>>>" + tutWithIdOne.getTitle() + " " + savedTut.getTitle());
            tutorialRepository.save(tutWithIdOne);
        }

        List<Tutorial> tutorials = tutorialRepository.findAll();
        System.out.println(tutorials);
//
//        repo.findTestById(1);
//        Optional<Test> result = repo.findById(1);
//        System.out.println("Got Entry in table ---->>>" + result.isPresent());
    }
//
//    public void save(Speaker speaker) {
//        tutorialRepository.save(speaker);
//    }

//    ##########################################OLD#####################################
//    @Transactional
    public void addTutorial(Tutorial tutorial) {
        Tutorial savedTut = tutorialRepository.save(tutorial);
        System.out.println(tutorial);
    }

    public void addTutorials(List<Tutorial> tutorial) {
        tutorialRepository.saveAll(tutorial);
        System.out.println(tutorial);
    }

    @Override
    public Page<Tutorial> getAllEntities(int Page, int size, String sortField) {
        Pageable pageable = PageRequest.of(0, size, Sort.by("description"));
        return tutorialRepository.findAll(pageable);
    }

    public List<Tutorial> getTutorials() { //Instead of getting by description, We can go by stream
        List<Tutorial> listOfTutorials  = tutorialRepository.findAll();
        List<Tutorial> listOfCloudTutorials = listOfTutorials.stream().filter(tutorial -> tutorial.getDescription().equals("cloud")).collect(Collectors.toList());
        System.out.println("List Of Tutorials------------------>>>" + listOfCloudTutorials);

        return listOfCloudTutorials;
    }

    @Override
    public List<Tutorial> findBydescriptionContains( String sortField) {
//        List<Tutorial> tut = tutorialRepository.findBydescriptionContains("Cloud");
        List<Tutorial> tut = tutorialRepository.findBydescriptionLike("%loud%");
        System.out.println(tut);
        return tut;
    }

    @Override
    public List<Tutorial> findBydescriptionLike(String descName) {
        List<Tutorial> tut = tutorialRepository.findBydescriptionLike("%loud%");
        System.out.println(tut);
        return tut;
    }

    public List<Tutorial> getTutorialsBydescription(String descName){
        List<Tutorial> tut = tutorialRepository.findBydescriptionLike("%loud%");
        System.out.println("=====================>>" + tut);
        return tut;
    }

}


