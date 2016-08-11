package com.example.payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Galih_P on 8/9/2016.
 */
@Component
public class DatabaseLoader {

    private final EmployeeRepository repository;

    @Autowired
    public DatabaseLoader(EmployeeRepository repository) {
        this.repository = repository;
    }

    /*@Override
    public void run(String... args) throws Exception {
        this.repository.save(new Employee("Frodo", "Baggins", "ring bearer"));
        this.repository.save(new Employee("Bilbo", "Baggins", "last guradian"));
        this.repository.save(new Employee("Baggins", "Baggins", "dummy"));
    }*/
}
