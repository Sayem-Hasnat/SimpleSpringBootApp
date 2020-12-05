package com.example.simple.init;

import com.example.simple.entity.Employee;
import com.example.simple.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.springframework.boot.CommandLineRunner;

@Component
public class InitializeData implements CommandLineRunner {
    @Autowired
    EmployeeRepository repository;

    @Override
    public void run(String... args) throws Exception {

        Employee employee1 = new Employee();
        employee1.setName("Hasnat");
        employee1.setAge(25);
        employee1.setDept("Engineer");
        repository.save(employee1);

    }
}
