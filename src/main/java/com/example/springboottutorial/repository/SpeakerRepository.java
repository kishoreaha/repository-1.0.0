package com.example.springboottutorial.repository;

import com.example.springboottutorial.model.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
//    void findSpeakertById(Integer id);
}
