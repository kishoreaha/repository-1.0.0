package com.example.springboottutorial.service.impl;

import com.example.springboottutorial.model.Course;
import com.example.springboottutorial.model.Speaker;
import com.example.springboottutorial.repository.CourseRepository;
import com.example.springboottutorial.repository.SpeakerRepository;
import com.example.springboottutorial.repository.TutorialRepository;
import com.example.springboottutorial.service.SpeakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpeakerServiceImpl implements SpeakerService {


    @Autowired
    SpeakerRepository speakerRepository ;

    @Autowired
    private CourseRepository courseRepository;

    public void save(Speaker speaker){
        speakerRepository.save(speaker);
    }

    @Override
    public void save(Course course) {
        courseRepository.save(course);
    }
}
