package com.example.simple.controller;

import com.example.simple.entity.Employee;
import com.example.simple.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeRepository repository;

    @RequestMapping("/")
    String getAllEmployees(Model model){

       List<Employee> listEmployee = repository.findAll();
       model.addAttribute("employeeList",listEmployee);

        return "Index";
    }
}
