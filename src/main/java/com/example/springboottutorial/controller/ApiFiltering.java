package com.example.springboottutorial.controller;

import com.example.springboottutorial.model.Filter.DynFilter;
import com.example.springboottutorial.model.Filter.Filter;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ApiFiltering {

    @GetMapping("filtering")
    public Filter getFilteredBean(){
        return new Filter("field1","field2","field3");
    }


    @GetMapping("getfilteringList")
    public List<Filter> getFilteredBeanList(){
        return Arrays.asList(
                new Filter("field1","field2","field3"),
                new Filter("field4","field5","field6"));
    }



    @GetMapping("/dynamicfiltering")
    public MappingJacksonValue getDynamicFiltering(){
        DynFilter dynbean = new DynFilter("field1","field2","field3");

        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(dynbean);
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1");
        FilterProvider provider= new SimpleFilterProvider().addFilter("someFilter",filter);
        mappingJacksonValue.setFilters(provider);
        return mappingJacksonValue;
    }

}
