package com.example.demo.springplayground;

import org.junit.runner.*;
import org.springframework.boot.test.autoconfigure.web.servlet.*;
import org.springframework.test.context.junit4.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

import javax.print.attribute.standard.*;
import java.util.*;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
    @WebMvcTest(MockTestController.class)
public class MockTestControllerTest {
   @Autowired
        private MockMvc mvc;
   @Test
        public void testCreateComment() throws Exception {
       String content = String.valueOf(new Random().nextInt());
       String author = "Chris";
       MockHttpServletRequestBuilder request1 = post("/comments")
               .contentType(MediaType.APPLICATION_FORM_URLENCODED)
               .param("content", content)
               .param("author", author);
       this.mvc.perform(request1)
               .andExpect(status().isOk())
               .andExpect(content().string(String.format("%s said %s", author, content)));

   }
    @Test
    public void testGetPerson() throws Exception {
        String firstName = "First";
        String lastName = "Last";
        this.mvc.perform(post("/comments/person"))
                .andExpect(status().isOk())
                .andExpect(content().string(String.format(firstName, lastName)));

    }
}
