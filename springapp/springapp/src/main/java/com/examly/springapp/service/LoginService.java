package com.examly.springapp.service;

import org.springframework.web.bind.annotation.*;
import com.examly.springapp.repository.*;
import com.examly.springapp.model.*;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.*;
import java.util.*;

@Service
public class LoginService {    
   
    private LoginRepository loginRepository;
    private EmployeeRepository employeeRepository;
    private CustomerRepository customerRepository;

    public LoginService(LoginRepository loginRepository,EmployeeRepository employeeRepository,CustomerRepository customerRepository){
        this.loginRepository = loginRepository;
        this.employeeRepository = employeeRepository;
        this.customerRepository = customerRepository;
    }

    public List<LoginModel> getAllUsers(){
       return loginRepository.findAll();
    }

    public boolean verifyLogin(LoginModel loginModel){
        EmployeeModel employeeModel = employeeRepository.findByEmail(loginModel.getEmail());
        CustomerModel customerModel = customerRepository.findByEmail(loginModel.getEmail());
      
        if(employeeModel!=null){
            if(employeeModel.getEmail().equals(loginModel.getEmail())){
                if(employeeModel.getPassword().equals(loginModel.getPassword())){
                    return true;
                }  else {
                    return false;
                }
            } else {
                return false; }
        } else if(customerModel!=null) {
            if(customerModel.getEmail().equals(loginModel.getEmail())){
                if(customerModel.getPassword().equals(loginModel.getPassword())){
                    return true;
                }  else {
                    return false;
                }
            } else {
                return false; 
            }
        }
        else {
            System.out.println("User not found");
            return false;
        }
      
    }
}
