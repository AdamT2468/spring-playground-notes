package com.example.demo.json;

import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

//    @Autowired
//    UserService userService;
//
//    @GetMapping("/users")
//    @JsonView(Views.ListView.class)
//    public List<User> getUsers() {
//        return userService.getUsers();
//    }
//
//    @GetMapping("/users/{id}")
//    @JsonView(Views.DetailView.class)
//    public User getUser(@PathVariable int id) {
//        return userService.getUser(id);
//    }
}
