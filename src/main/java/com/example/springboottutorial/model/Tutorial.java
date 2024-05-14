package com.example.springboottutorial.model;
//package com.bezkoder.spring.jpa.query.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import java.util.Date;

//@JsonIgnoreProperties
@Entity
@Table(name = "tutorials")
public class Tutorial {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

//    @JsonProperty(value = "TitleName")
    private String title;

    private String description;

    private int level;

    private boolean published;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Tutorial() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Tutorial{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", level=" + level +
                ", published=" + published +
                ", createdAt=" + createdAt +
                '}';
    }

    public Tutorial(String title, String description, int level, boolean published, Date createdAt) {
        this.title = title;
        this.description = description;
        this.level = level;
        this.published = published;
        this.createdAt = createdAt;
    }

    // getters and setters
}