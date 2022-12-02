package com.accolite.au.filecolection.service;

import com.accolite.au.filecolection.model.Employee;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

@Service
public class EmployeeService {
    @Value("${csv.filepath}")
    private String filePath;


    public void appendEmployee(String fileName, String str){
        try {
            // Open given file in append mode by creating an
            // object of BufferedWriter class
            BufferedWriter out = new BufferedWriter(
                    new FileWriter(fileName, true));
            // Writing on output stream
            out.write(str);
            out.write('\n');       // Closing the connection
            out.close();
        }
        // Catch block to handle the exceptions
        catch (IOException e) {
            // Display message when exception occurs
            System.out.println("exception occurred" + e);
        }
    }
    public void populateEmployee(List<Employee> employeeList) throws IOException {
        System.out.println("Employee populate");
        employeeList.forEach(employee -> System.out.println(employee));
       // employeeList.forEach(employee -> appendEmployee(filePath, employee.toString()));
        for(Employee employee:employeeList){

            appendEmployee(filePath,employee.toString());
        }
    }
}