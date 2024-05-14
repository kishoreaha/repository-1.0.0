package com.example.springboottutorial.controller;

import com.example.springboottutorial.model.Course;
import com.example.springboottutorial.model.Speaker;
import com.example.springboottutorial.model.Tutorial;
import com.example.springboottutorial.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
public class TutorialController {

    @Autowired
    TutorialService tutorialService;
//
//    @PostMapping(path="/addTutorial",headers = "mu")
//    public ResponseEntity<> addTutorial(@RequestBody Tutorial tutorial) {
//        tutorialService.addTutorial(tutorial);
//        return new ResponseEntity(HttpStatus.OK)
//    }

    @PostMapping("/addTutorial")
    public String addTutorial(@RequestBody Tutorial tutorial) {
        tutorialService.addTutorial(tutorial);
        return "Empty";
    }


    //,consumes = "application/xml"
    @PostMapping(value = "/addTutorials")
//    public ResponseEntity<Page<Tutorial>>  addTutorials(@RequestBody List<Tutorial> tutorials) {
    public ResponseEntity<List<Tutorial>>  addTutorials(@RequestBody List<Tutorial> tutorials) {
        System.out.println("List----------------------->>>>" + tutorials);
        tutorialService.addTutorials(tutorials);

        /*
        Page<Tutorial> entities = tutorialService.getAllEntities(0, 6, "description");

        //Calling AND | OR | EQ
//        tutorialService.findBydescriptionContains("Cloud");
        tutorialService.findBydescriptionLike("%loud%");

        //Calling the@Query Annotation - Undefined Method in the JPARepo format.
        //Custom Method Name Format --->>> TODO::Check why the Count is 0 in this Array
        tutorialService.getTutorialsBydescription("loud");

        //To Check the Insertion via the SpringBoot call
        Speaker speaker = new Speaker();
        speaker.setSpeakerName("Rubiya");
        speaker.setId(1);

        Set<Course> listOfCourses = new HashSet<>();
        Course course = new Course();
        course.setId(1);
        course.setCourseName("SpringBoot");

        Speaker speaker1 = new Speaker();
        speaker1.setSpeakerName("Kishore");
        speaker1.setId(2);

        Set<Speaker> speakers = new HashSet<>();
        speakers.add(speaker1);
        course.setStudent(speakers);

        listOfCourses.add(course);
        speaker.setCourse(listOfCourses);
//        tutorialService.save(speaker);*/

//        return ResponseEntity.ok(entities);

        return ResponseEntity.ok(tutorials);
    }

    @GetMapping("/getTutorials")
    public List<Tutorial>  getTutorials() {
        return tutorialService.getTutorials();
    }


    @PutMapping("/putTutorial")
    public List<Tutorial>  putTutorials(@RequestBody List<Tutorial> tutorials){
        System.out.println("List----------------------->>>>" );
//        return tutorialService.getTutorials();
        return null;
    }


    @PatchMapping("/postTutorial")
    public List<Tutorial>  patchTutorials(@RequestBody List<Tutorial> tutorials) {
        System.out.println("List----------------------->>>>" );
//        return tutorialService.getTutorials();
        return null;
    }

}