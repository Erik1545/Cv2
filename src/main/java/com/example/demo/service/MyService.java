package com.example.demo.service;

public class MyService implements MyServiceInterface {
    @Override
    public void hi(String name) {
        System.out.println("HI " + name);
    }
}


