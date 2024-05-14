package com.example.springboottutorial.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "course")
public class Course {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Set<Speaker> getStudent() {
        return student;
    }

    public void setStudent(Set<Speaker> student) {
        this.student = student;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="course_id")
    private Integer id;

    @Column(length = 50)
    private String courseName;

    @ManyToMany(mappedBy = "course")
    private Set<Speaker> student;
}
