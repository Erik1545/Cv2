package com.example.demo.cv3;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
public class DatabaseRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("ApplicationRunner; arguments: ");
        Arrays.stream(args.getSourceArgs())
                .forEach(System.out::println);
    }
}
