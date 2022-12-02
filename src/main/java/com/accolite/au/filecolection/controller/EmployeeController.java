package com.accolite.au.filecolection.controller;

import com.accolite.au.filecolection.service.EmployeeService;
import com.accolite.au.filecolection.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping(path = "/employee/populate")
    private ResponseEntity<String> populateEmployee(@Validated @RequestBody List<Employee> employee) throws IOException {
        for(Employee employee1:employee){
            System.out.println(employee1);
        }
        employeeService.populateEmployee(employee);
        return ResponseEntity.ok().body("success");
    }


}
