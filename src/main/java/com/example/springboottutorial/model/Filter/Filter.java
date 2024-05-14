package com.example.springboottutorial.model.Filter;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties({"fieldTwo","fieldThree"})
public class Filter {
    private String fieldOne;

    @JsonIgnore
    private String fieldTwo;  // This gets ignored from all API Get Call With this annotation
    private String fieldThree;

    public Filter(String fieldOne, String fieldTwo, String fieldThree) {
        this.fieldOne = fieldOne;
        this.fieldTwo = fieldTwo;
        this.fieldThree = fieldThree;
    }

    public String getFieldOne() {
        return fieldOne;
    }

    public String getFieldTwo() {
        return fieldTwo;
    }

    public String getFieldThree() {
        return fieldThree;
    }

    @Override
    public String toString() {
        return "Filter{" +
                "fieldOne='" + fieldOne + '\'' +
                ", fieldTwo='" + fieldTwo + '\'' +
                ", fieldThree='" + fieldThree + '\'' +
                '}';
    }
}
