package com.example.springboottutorial.repository;

import com.example.springboottutorial.model.Course;
import com.example.springboottutorial.model.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
