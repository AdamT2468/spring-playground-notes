package com.example.demo;

import org.springframework.web.bind.annotation.*;

    @RestController
public class HelloController {
    @GetMapping("/")
        public String helloWorld() {
        return "Hello from Spring!";
    }
}
