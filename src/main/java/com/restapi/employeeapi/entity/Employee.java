package com.restapi.employeeapi.entity;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 50, nullable = false)
    private String name;

    @Column(name = "position", length = 50)
    private String position;

    @Column(name = "salary")
    private Double salary;

    // Getters and Setters
    // ...

    // toString, hashCode, equals (if necessary)
    // ...
}
