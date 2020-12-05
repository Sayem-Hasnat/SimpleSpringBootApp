package com.example.simple.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "Employee")
@Getter
@Setter
@NoArgsConstructor
public class Employee {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)

    long Id;
    @Column
    String name;
    int age;
    String dept;

}
