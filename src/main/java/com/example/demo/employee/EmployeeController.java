package com.example.demo.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @GetMapping("/employee")
    public List<Employee> getEmployee(){
        List<Employee> employees = new ArrayList<>();
        Employee nik = new Employee("Nik", 1, 10000d);
        Employee anthony = new Employee("Anthony", 2, 200000d);

        employees.add(anthony);
        employees.add(nik);

        return employees;
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable Integer id){
        Employee john = new Employee("John", id, 15d);

        return john;
    }
}
