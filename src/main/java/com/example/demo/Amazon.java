package com.example.demo;

import org.springframework.web.bind.annotation.*;
@RestController
public class Amazon {
    @GetMapping("/product/{productID}")
    public int getProduct(@PathVariable int productId) { //input needs to be same as whats in the curly bracket
        return productId;
    }
}
