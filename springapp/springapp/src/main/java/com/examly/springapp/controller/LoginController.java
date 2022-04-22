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

import javax.security.auth.spi.LoginModule;


@RestController
@RequestMapping("/")
// @ResponseBody
public class LoginController {

    private LoginService loginService;
    private EmployeeService employeeService;

    public LoginController(LoginService loginService, EmployeeService employeeService){
        this.loginService = loginService;
        this.employeeService = employeeService;
    }
  
    @GetMapping("/login")
    public List<LoginModel> getAllUsers(){
        System.out.println("hi i am login");
        return loginService.getAllUsers();
        // return new ArrayList<>();
    }

    @CrossOrigin
    @PostMapping("/login")
    public boolean verifyLogin(@RequestBody LoginModel loginModel){
        System.out.println("hi i am login post");
        return loginService.verifyLogin(loginModel);
    }

    @PutMapping("/editCustomer")
    public CustomerModel verifyLogin(@RequestParam(value="customerId", required = false) String id, @RequestBody CustomerModel customerModel){
        System.out.println("hi i am customer put");
        return employeeService.updateCustomer(id,customerModel);
    }

    @PostMapping("/admin/addRoutes")
    public RouteModel addRoutes(@RequestBody RouteModel routemodel){
        System.out.println("hi i am route");
        return employeeService.addRoutes(routemodel);
    }

    @PutMapping("/admin/editRoutes")
    public RouteModel editRoutes(@RequestParam(value="routeId", required = false) String id, @RequestBody RouteModel routeModel){
        System.out.println("hi i am edit route");
        return employeeService.editRoutes(id, routeModel);
    }

}
