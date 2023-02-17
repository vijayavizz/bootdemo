package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @GetMapping("/greet")
    public String greet(){
        return "welcome";
    }

    @GetMapping("/ping")
    public String ping(){
        return "ping back at you";
    }

}
