package com.example.springboottutorial.service;

import com.example.springboottutorial.model.Course;
import com.example.springboottutorial.model.Speaker;

public interface SpeakerService {
//    public void speak(String text);
    void save(Speaker speaker);
    void save(Course course);
}
