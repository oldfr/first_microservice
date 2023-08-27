package com.example.firstmicroservice.controller;

import com.example.firstmicroservice.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/first")
public class FirstController {

    @GetMapping
    public List<Student> getStudent() {
        System.out.println("getting students");
        return Arrays.asList(new Student(1,"Ankitha","Student"),
        new Student(2,"Adithya","Student"));
    }

    @PostMapping
    public Boolean createStudent(@RequestBody Student student) {
        System.out.println("creating Student:"+student);
        return true;
    }

}
