package com.example.demo.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

import java.util.HashMap;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(JSONRequestController.class)
public class JSONRequestControllerTest {



    @Autowired
    MockMvc mvc;



    @Test
    public void testObjectParams() throws Exception {  // send a string as your content
        MockHttpServletRequestBuilder request = post("/jr/object-example") // using post reqquests
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                        {
                            "q":"other",
                            "from": 2010
                        }
                        """); // use content to fill in body

        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("Search: q=something from=2008"));
    }

    ObjectMapper objectMapper = new ObjectMapper(); // serilize using maps (1)


    @Test
    public void testCreate() throws Exception { // serialize using maps -- add object mapper as a field
        HashMap<String, Object> data = new HashMap<String, Object>(){  // 2
            {
                put("name", "Hercules"); // add name and age to hashmap
                put("age", 57);             // {"name": "Hercules", "age": 57}
            }
        };

        String json = objectMapper.writeValueAsString(data);            // 3  take a hashmap and write as a string
                                                                        //JSON reads strings

        MockHttpServletRequestBuilder request = post("/some/path")   // whatever your pathname is
                .contentType(MediaType.APPLICATION_JSON)                // applicaton to be used
                .content(json);                                         // 4   call the string above

        this.mvc.perform(request).andExpect(status().isOk()); // perform builder requst. is ok
    }
}
