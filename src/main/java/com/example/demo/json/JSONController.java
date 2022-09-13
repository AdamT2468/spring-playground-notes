package com.example.demo.json;

import com.example.demo.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/json")
public class JSONController {

    // render a JSON Object in a response
    /*  produces
             {
            "firstName": "Dwayne",
           "lastName": "Johnson"
         }
    */

    @GetMapping("/person")
    public Person getPerson() {
        Person person = new Person();
        person.setFirstName("Dwayne");
        person.setLastName("Johnson"); // does not display due to JSON_Include being called on teh Person Class
        return person;
    }

    // render a list in a responst LIST or ARRAY

    /* returns [
    {
    "firstName": "Dwayne",
    "lastName": "Johnson"
        }, {
    "firstName": "John",
    "lastName": "Cena"
        }
      ]
*/


    @GetMapping("/people")
    public List<Person> getPeople() {
        Person person1 = new Person();
        person1.setFirstName("Dwayne");
        person1.setLastName("Johnson");

        Person person2 = new Person();
        person2.setFirstName("John");
        person2.setLastName("Cena");

        return Arrays.asList(person1, person2);
    }


    //customize JSON data
    //In order to customize JSON data, you need to create a "View". A view is basically an empty interface, and you set it up like so:

}
