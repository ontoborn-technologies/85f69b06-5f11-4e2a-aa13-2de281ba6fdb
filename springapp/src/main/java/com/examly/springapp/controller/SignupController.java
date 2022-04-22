package com.examly.springapp.controller;

import org.springframework.web.bind.annotation.DeleteMapping; 
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.PutMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.*;
import com.examly.springapp.repository.*;
import com.examly.springapp.service.*;
import com.examly.springapp.model.*;

import org.springframework.http.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import java.util.*;


@RestController
@RequestMapping("/")
// @ResponseBody
public class SignupController {

    private EmployeeService employeeService;

    public SignupController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }
  
    @CrossOrigin
    @PostMapping("/signup")
    public boolean signUpCustomer(@RequestBody EmployeeModel employeeModel){
        System.out.println("i am employee");
           return employeeService. addEmployee(employeeModel);
    }
}
