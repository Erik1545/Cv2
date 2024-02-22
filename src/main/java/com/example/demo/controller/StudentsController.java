package com.example.demo.controller;

import com.example.demo.service.Student;

import java.util.HashMap;

public class StudentsController {
    public void getAll(HashMap<Integer, Student> studentMap) {
        System.out.println("Všichni studenti:");
        for (Student student : studentMap.values()) {
            System.out.println("ID: " + student.getId() + ", jmeno: " + student.getName() + ", pozice: " + student.getPosition());
        }
    }

}
