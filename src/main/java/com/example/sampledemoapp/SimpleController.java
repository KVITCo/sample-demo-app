package com.example.sampledemoapp;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @RequestMapping("/")
    public String index() {
        return  "hello.....world of spring boot";

    }
}
