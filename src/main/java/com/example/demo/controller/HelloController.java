package com.example.demo.controller;


import org.springframework.web.bind.annotation.*;


// RestController zobrazuje název komponenty, či název beamu
// RequestMapping se používá k určení cesty
@RestController
@RequestMapping("/api/v1")
public class HelloController {
    @GetMapping("")
    public String helloWorld(){
        return "Hello world from Spring Boot application";

    }
    @GetMapping("/path/{param}")
    public String getPathParam(@PathVariable String param) {
        return "Parametr v cestě: " + param;
    }

    @RequestMapping(value = "/pathMethod/{param}", method = RequestMethod.GET)
    public String getPathParamWithMethod(@PathVariable String param) {
        return "Parametr v cestě s omezením na GET metodu: " + param;
    }

    @GetMapping("/query")
    public String getQueryParam(@PathVariable String param) {
        return "Parametr v query parametru: " + param;
    }


}
