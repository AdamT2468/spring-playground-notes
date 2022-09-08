package com.example.demo.dog;


import org.springframework.web.bind.annotation.*;

@RestController
public class DogController {

    @GetMapping("/dog")
    public String getHome() {
        return "Have a Nice Four Day Weekend";
    }

//    @GetMapping("/dogs")
//    public String getDogs() {
//        return "Dogs say Bark Bark";


    @GetMapping("/dogs/{dogId}")
    public String getDogById(@PathVariable String dogId) {
        return "This is dog number: " + dogId;
    }
}
