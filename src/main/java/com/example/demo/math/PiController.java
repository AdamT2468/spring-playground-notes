package com.example.demo.math;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class PiController {
    @GetMapping("/math/pi")
    public String pi() {
         double pi = Math.PI;

        return String.valueOf(pi);
    }

}
