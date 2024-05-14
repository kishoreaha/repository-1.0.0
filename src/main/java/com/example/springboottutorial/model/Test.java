package com.example.springboottutorial.model;
import jakarta.persistence.*;

//import jakarta.persistence.Id;
//
@Entity//()
//@Table
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String firstName) {
        this.name = firstName;
    }
}
