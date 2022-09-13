package com.example.demo.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class UserTest {

    @Test
    public void whenUseJsonViewToSerialize_thenCorrect()
            throws JsonProcessingException {

        User user = new User(1, "John");

        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(MapperFeature.DEFAULT_VIEW_INCLUSION);

        String result = mapper
                .writerWithView(Views.Public.class)
                .writeValueAsString(user);

        assertThat(result, containsString("John"));
        assertThat(result, containsString("1"));
    }
}
