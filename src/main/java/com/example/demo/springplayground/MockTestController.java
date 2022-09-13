package com.example.demo.springplayground;


import com.example.demo.Person;
import org.springframework.web.bind.annotation.*;

@RestController
public class MockTestController {
    @PostMapping("/comments/person")
//    public String getComment(@RequestParam Map<String, String> authorContentMap) {
//
//        return (String.format("%s said %s", authorContentMap.get("author"), authorContentMap.get("content")));
//    }
    public String getComment(Person person) {
        return person.toString();
    }
}
