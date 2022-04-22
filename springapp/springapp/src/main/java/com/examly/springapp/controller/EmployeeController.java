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
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }
  
    @CrossOrigin
    @GetMapping("/admin")
    public List<EmployeeModel> getEmployeeDetails(){
        System.out.println("hi i am employee");
        return employeeService.getAllEmployees();
    }

    
    @GetMapping("/admin/getEmployee")
    public List<EmployeeModel> getEmployeeById(){
        return employeeService.getAllEmployees();
    }

    @CrossOrigin
    @GetMapping("/admin/employeeDetails")
    public EmployeeModel getEmployeeDetailsById(@RequestParam(defaultValue = "1" ) String email ){
        System.out.println("hi i am employee by id");
        return employeeService.getEmployeeById(email);
    }


    @PutMapping("/admin/editEmployee")
    public void editEmployeeById(@RequestBody EmployeeModel employeeModel){
        System.out.println("hi i am employee by edit id");
        employeeService.editEmployee(employeeModel);
    }

    @PutMapping("/admin/saveEmployee")
    public void saveNewEmployee(@RequestBody EmployeeModel employeeModel){
        System.out.println("hi i am employee by save id");
        employeeService.saveEmployee(employeeModel);
    }

    @DeleteMapping("/admin/deleteEmployee")
    public void deleteEmployeeById(@RequestParam String id ){
        System.out.println("hi i am employee by delete id");
        employeeService.deleteEmployeeById(id);
    }

    @PutMapping("/editCustomer/{id}")
    public CustomerModel verifyLogin(@PathVariable String id, @RequestBody CustomerModel customerModel){
        System.out.println("hi i am customer put");
        return employeeService.updateCustomer(id,customerModel);
    }
}
