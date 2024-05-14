package com.example.springboottutorial.controller;

import com.example.springboottutorial.model.PersonV1;
import com.example.springboottutorial.model.Name;
import com.example.springboottutorial.model.PersonV2;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    //These are the URI Based API Versioning - Path differs
    @GetMapping("/v1/person")
    public PersonV1 getFirstVersionOfPerson(){
        return new PersonV1("Rubiya Kishore");
    }

    @GetMapping("/v2/person")
    public PersonV2 getSecondVersionOfPerson(){
        return new PersonV2(new Name("Rubiya","Kishore"));
    }


    @GetMapping(path="/person",headers = "X-API-VERSION=1")
    public PersonV1 getHeaderFirstVersionOfPerson(){
        return new PersonV1("Rubiya Kishore");
    }


    @GetMapping(path="/person",headers = "X-API-VERSION=2")
    public PersonV2 getHeaderSecondVersionOfPerson(){
        return new PersonV2(new Name("Rubiya", "Kishore"));
    }

//
//    @GetMapping(path="/person",params = "version=v1")
//    public PersonV1 getFirstVersionOfPerson(@RequestParam("version") String version){
//        return new PersonV1("Rubiya Kishore");
//    }


    //These are the Request Param Based API Versioning - Path Same
    @GetMapping("/person")
    public Object getFirstVersionOfPerson(@RequestParam("version") String version){
        if(version.equals("v1")){
            System.out.println("getFirstVersionOfPerson");
            return new PersonV1("Rubiya Kishore");
        }
        else if (version.equals("v2") ){
            System.out.println("getSecondVersionOfPerson");
            return new PersonV2(new Name("Rubiya","Kishore"));
        }
        return new PersonV1("Rubiya Kishore");
//        return ResponseEntity.ok();
    }



//
//    @GetMapping(path = "person",params="version=1")
//    public PersonV1 getFirstVersionOfPerson(){
//        return new PersonV1("Rubiya Kishore");
//    }
//
//
//    @GetMapping(path = "person",params="version=2")
//    public PersonV1 getFirstVersionOfPerson(){
//        return new PersonV1("Rubiya Kishore");
//    }

}
