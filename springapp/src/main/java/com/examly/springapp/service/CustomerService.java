package com.examly.springapp.service;

import org.springframework.web.bind.annotation.*;
import com.examly.springapp.repository.*;
import com.examly.springapp.model.*;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.*;
import java.util.*;

@Service
public class CustomerService {    
   
    private EmployeeRepository employeeRepository;
    private CustomerRepository customerRepository;
    private RouteRepository routeRepository;

    public CustomerService(EmployeeRepository employeeRepository, CustomerRepository customerRepository,RouteRepository routeRepository){
        this.employeeRepository = employeeRepository;
        this.customerRepository = customerRepository;
        this.routeRepository = routeRepository;
    }

    public boolean addCustomer(CustomerModel customerModel){
      System.out.println(customerModel.getMobilenumber());       
      try {
         CustomerModel customerModel1 = customerRepository.findByEmail(customerModel.getEmail());
         if(customerModel1!=null){
            customerModel1.setMobilenumber(customerModel.getMobilenumber());
            customerRepository.save(customerModel1);
         } else {
            customerRepository.save(customerModel);
         }
         return true;
      } catch(Exception e ) {
         System.out.println(e.getStackTrace());
         return false;
      }

    }

    public CustomerModel updateCustomer(String customerId, CustomerModel customerModel){
      CustomerModel customerModel1 = customerRepository.findByEmail(customerModel.getEmail());
      if(customerModel1!=null){
         customerModel1.setMobilenumber(customerModel.getMobilenumber());
         customerRepository.save(customerModel1);
      } else {
         customerRepository.save(customerModel);
      }
   
        return customerModel;
     }

}
