package com.example.demo.json;

import com.fasterxml.jackson.annotation.JsonView;
import org.apache.tomcat.jni.Address;

import java.util.List;

public class User {
    public int id;

    @JsonView(Views.Public.class)
    public String name;

    public User(int i, String john) {
    }
}
