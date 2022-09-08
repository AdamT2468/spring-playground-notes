package com.example.demo.cat;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class CatController {

//    @GetMapping("/cats")
//
//    public String getSpecificCats(@RequestParam Map<String, String> queryString) {
//
//        return String.format("The name of the cat is %s and it is a %s", queryString.get("name"), queryString.get("color"));
//
//    }
@GetMapping("/cats")
public String getSpecificCats(Cat newCat) {
    return String.format("The name of the cat is %s and it is a %s", newCat.getName(), newCat.getColor());
    }
}
