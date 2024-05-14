package com.example.springboottutorial.model.Filter;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;

@JsonFilter("somefilter")
public class DynFilter {
    private String fieldOne;
    private String fieldTwo;
    private String fieldThree;

    public DynFilter(String fieldOne, String fieldTwo, String fieldThree) {
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
