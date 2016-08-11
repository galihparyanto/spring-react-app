package com.example.payroll;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

/**
 * Created by Galih_P on 8/9/2016.
 */
@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "FIRSTNAME")
    private String firstName;

    @Column(name = "LASTNAME")
    private String lastName;

    @Column(name = "DESCRIPTION")
    private String description;

    @Version
    @JsonIgnore
    private Long version;

    private Employee() {}

    public Employee(String firstName, String lastName, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
    }
}
