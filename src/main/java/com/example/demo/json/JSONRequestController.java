package com.example.demo.json;

import com.example.demo.Person;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JSONRequestController {

    // accessing JSON Request Data
    @PostMapping("/")
    public String getJSONData(@RequestBody Person person) {
        return person.toString();
    }

    /*
    to view JSON

    {
  "title": "Blog Title",
  "articles": [
    {
      "title": "Article 1",
      "created_by": "Someone"
    },
    {
      "title": "Article 2",
      "created_by": "Someone Else"
    }
  ]
}

create class Aritcle and Blog then use below @PostMapping
     */

    @PostMapping("/nested-example")
    public String getNested(@RequestBody Blog blog) {
        return blog.getTitle();
    }

    // use this when debugging

    @PostMapping("/")
    // public String getJSONData(@RequestBody Person person) {
    public String getJSONData(@RequestBody String person) {
        // return person.toString();
        return ""; // <-- put a debugger breakpoint here and you can see the JSON that comes in
    }


}