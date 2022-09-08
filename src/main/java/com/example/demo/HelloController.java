package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController
public class HelloController {
    @GetMapping("/")
        public String helloWorld() {
        ArrayList<String> hello = new ArrayList<String>();
        hello.add("Hello welcome to Spring!");
        return hello.get(0);
    }
}
