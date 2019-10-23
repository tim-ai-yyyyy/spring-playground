package com.playground.playground.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlaygroundController {
    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello from Spring!";
    }

}
