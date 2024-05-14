package com.example.springboottutorial.controller;

import com.example.springboottutorial.service.SpeakerService;
import com.example.springboottutorial.model.Course;
import com.example.springboottutorial.model.Speaker;
import com.example.springboottutorial.model.Tutorial;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@RestController
public class SpeakerController {


    @Autowired
    SpeakerService speakerService;


    @RequestMapping(method = RequestMethod.POST,path="/addSpeaker")
//    @PostMapping(path="/addSpeaker")
//    @PostMapping("/addSpeaker")
    public String addSpeaker() {

        //Below Entities are Created like a Regular Java POJO Creation. They are not the entities in Persistent Store

//        Session session = SessionFactory.openSession();
//        session.beginTransaction();
//        session.save(user);
//        session.getTransaction().commit();
//        session.close();

        //To Check the Insertion via the SpringBoot call
        Speaker speaker = new Speaker();
        speaker.setSpeakerName("Rubiya");
//        speaker.setId(1);
        speakerService.save(speaker);

        Set<Course> listOfCourses = new HashSet<>();
        Course course = new Course();

//        course.setId(1);
        course.setCourseName("SpringBoot");
        speakerService.save(course);

        Speaker speaker1 = new Speaker();
        speaker1.setSpeakerName("Kishore");
//        speaker1.setId(2);

        Set<Speaker> speakers = new HashSet<>();
        speakers.add(speaker1);
        course.setStudent(speakers);

        listOfCourses.add(course);
        speaker.setCourse(listOfCourses);
        //TODO: Why this save is not inserting in DB - ManyToMany RelationShip
        speakerService.save(speaker);

        return "Empty";
    }
}
