package com.example.springboottutorial.service;

import com.example.springboottutorial.model.Speaker;
import com.example.springboottutorial.model.Tutorial;
import org.springframework.data.domain.Page;

import java.util.List;

public interface TutorialService {
    public void addTutorial(Tutorial tutorial);
    public void addTutorials(List<Tutorial> tutorial);
    public Page<Tutorial> getAllEntities(int Page,int Size, String sortField);
    public List<Tutorial> getTutorials();
    public List<Tutorial> findBydescriptionContains(String descName);
    public List<Tutorial> findBydescriptionLike(String descName);

    public List<Tutorial> getTutorialsBydescription(String descName);

//    void save(Speaker);
}
