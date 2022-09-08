package com.example.demo.cats;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.autoconfigure.web.servlet.*;
import org.springframework.test.web.servlet.*;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
@WebMvcTest
public class CatsControllerTest {

    @Autowired
    MockMvc mvc;

    @Test
    void getCatsReturnsNameOfCat() throws Exception {
        this.mvc.perform(get("/cats?name=fluffy&color=tabby"))
                .andExpect(status().isOk())
                .andExpect(content().string("The name of the cat is fluffy and it is a tabby"));
    }
}
