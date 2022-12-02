package com.accolite.au.filecolection.model;

import lombok.Data;
import org.springframework.lang.NonNull;


@Data
public class Employee {
    @NonNull
    private String name;
    @NonNull
    private Integer id;
    @NonNull
    private Integer salary;
    @NonNull
    private String  doj;
    @Override
    public String toString() {
        return name+','+id+','+salary+','+doj;
    }
}