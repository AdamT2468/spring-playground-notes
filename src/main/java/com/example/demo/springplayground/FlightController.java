package com.example.demo.springplayground;

import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RestController
public class FlightController {

    public List<Flight> getFlights() {
        Flight flight1 = new Flight();
        flight1.setId(4);
        flight1.setDestination("London");
        flight1.setDepartsOn(new Date(2022, Calendar.MAY, 8));

        Flight flight2 = new Flight();
        flight2.setId(4);
        flight2.setDestination("George Town");
        flight2.setDepartsOn(new Date(2021, Calendar.MAY, 8));

        return Arrays.asList(flight1, flight2);
    }
}
