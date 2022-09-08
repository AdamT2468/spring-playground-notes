package com.example.demo.math;

import com.example.demo.math.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.autoconfigure.web.servlet.*;
import org.springframework.test.web.servlet.*;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@WebMvcTest(PiController.class)
public class PiControllerTest {
    @Autowired
    MockMvc mvc;

    @Test
    public void testPi() throws Exception {
//        RequestBuilder request = MockMvcRequestBuilders.get("/math/pi");
//        this.mvc.perform(request).andExpect(content().string("3.141592653589793"));
        this.mvc.perform(get("/math/pi"))
                .andExpect(status().isOk())
                .andExpect(content().string(String.valueOf(Math.PI)));

        }
    }
