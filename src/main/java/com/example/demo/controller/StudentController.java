package com.example.demo.controller;

import com.example.demo.service.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student/")
public class StudentController {
    public void getById(int id) {
        Student element = idMap.get(id);
        if (element != null) {
            System.out.println("ID" + id + "cloveka existuje");
            System.out.println("jmeno: " + element.getName() + ", pozice: " + element.getPosition());
        } else {
            System.out.println("ID " + id + " cloveka neexistuje");
        }
    }

}
