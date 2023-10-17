package com.JPA.example.controller;

import com.JPA.example.entity.Laptop;
import com.JPA.example.repository.JPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LaptopController {
    @Autowired
    private JPARepository jpaRepository;
    @PostMapping("add/laptop")
    public Laptop createLaptop(@RequestBody Laptop laptop){
        //save method return what is saved in database
        return jpaRepository.save(laptop);
    }
    @GetMapping("fetch/laptop")
    //This method return a list of laptop store in database
    public List<Laptop> fetchLaptop(){
        return jpaRepository.findAll();
    }

}
