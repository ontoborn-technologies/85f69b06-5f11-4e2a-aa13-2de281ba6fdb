package com.examly.springapp.service;

import org.springframework.web.bind.annotation.*;
import com.examly.springapp.repository.*;
import com.examly.springapp.model.*;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.*;
import java.util.*;

@Service
public class EmployeeService {    
   
    private EmployeeRepository employeeRepository;
    private CustomerRepository customerRepository;
    private RouteRepository routeRepository;

    public EmployeeService(EmployeeRepository employeeRepository, CustomerRepository customerRepository,RouteRepository routeRepository){
        this.employeeRepository = employeeRepository;
        this.customerRepository = customerRepository;
        this.routeRepository = routeRepository;
    }

    public EmployeeModel getEmployeeById(String email){
        System.out.println("id " + email);
        return  employeeRepository.findByEmail(email);
    }

    public List<EmployeeModel> getAllEmployees(){
     
     return employeeRepository.findAll(); 
  }

    public boolean addEmployee(EmployeeModel employeeModel){
      EmployeeModel employeeModel1 =  employeeRepository.findByEmail(employeeModel.getEmail());
      if(employeeModel1 == null) {
         employeeRepository.save(employeeModel);
      }
      else {
         return false;
      }
      return true;
    }

    public void editEmployee(EmployeeModel employeeModel){
      EmployeeModel employeeModel1 =  employeeRepository.findEmployeeById(employeeModel.getEmail());
      employeeModel1.setMobileNumber(employeeModel.getMobileNumber());  
      employeeModel1.setVehicleModel(employeeModel.getVehicleModel());
      employeeModel1.setVehicleNumber(employeeModel.getVehicleNumber());

      employeeRepository.save(employeeModel1);
   }

   public void saveEmployee(EmployeeModel employeeModel){
      employeeRepository.save(employeeModel);
   }

   public void deleteEmployeeById(String id){
        
      employeeRepository.deleteEmployeeById(id);
   }

    public CustomerModel updateCustomer(String customerId, CustomerModel customerModel){
               
        customerRepository.save(customerModel);
        customerRepository.findByCustomerId(customerId);
        customerModel.setCustomerId(customerId);
        customerRepository.save(customerModel);
        return customerModel;
     }
     public String updateCustomerById(String customerId,CustomerModel customerModel){
      
      CustomerModel customerModel1 = customerRepository.findByCustomerId(customerId);
      customerModel1.setMobilenumber(customerModel.getMobilenumber());
      customerRepository.save(customerModel1);
      return "Success";
   }
     public RouteModel addRoutes(RouteModel routeModel){
        routeRepository.save(routeModel);
        return routeModel;
     }

     
     public RouteModel editRoutes(String id, RouteModel routeModel){
        routeRepository.save(routeModel);
        routeRepository.findByRouteId(id);
        routeModel.setRouteId(id);
        routeRepository.save(routeModel);
        return routeModel;
     }
}
