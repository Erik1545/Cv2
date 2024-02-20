package com.example.demo.service;

import java.util.HashMap;

public class MyService implements MyServiceInterface {
    private HashMap<Integer, Student> studentMap = new HashMap<>();;


    public void addEmployee(Student employee) {
        studentMap.put(employee.getId(), employee);
    }

}
