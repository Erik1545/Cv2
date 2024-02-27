package com.example.demo.controller;

import com.example.demo.cv3.AppUser;
import com.example.demo.cv3.AppUserRepository;
import com.example.demo.service.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;


@RestController
@RequestMapping("/students")
public class StudentsController {

    @Autowired
    private AppUserRepository userRepository;

    @GetMapping("/active")
    public List<AppUser> getActiveUsers() {
        return userRepository.findByActive(true);
    }


    public void getAll(HashMap<Integer, Student> studentMap) {
    }
}

