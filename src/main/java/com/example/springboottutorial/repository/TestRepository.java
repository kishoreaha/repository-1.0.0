package com.example.springboottutorial.repository;

//import com.example.springboottutorial.model.H2TestDBEntity;
import com.example.springboottutorial.model.Test;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends CrudRepository<Test, Integer> {

    void findTestById(Integer id);


}