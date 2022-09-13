package com.example.demo.springplayground;

import com.example.demo.Person;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

class Flight {
    private int id;
    private String destination;

    private Date departsOn;

    private List<Person> passengers;  // add new field to nest Objects in JSON

    private Person pilot;

    public Person getPilot() {
        return pilot;
    }

    public void setPilot(Person pilot) {
        this.pilot = pilot;
    }

    public List<Person> getPassengers() { return passengers; }

    public void setPassengers(List<Person> passengers) { this.passengers = passengers; }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getDestination() { return destination; }

    public void setDestination(String destination) { this.destination = destination; }

    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getDepartsOn() { return departsOn; }

    public void setDepartsOn(Date dateTime) { this.departsOn = dateTime; }
}