package com.examly.springapp.service;

import org.springframework.web.bind.annotation.*;
import com.examly.springapp.repository.*;
import com.examly.springapp.model.*;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.*;
import java.util.*;

@Service
public class RouteService {    
   
    private EmployeeRepository employeeRepository;
    private CustomerRepository customerRepository;
    private RouteRepository routeRepository;

    public RouteService(EmployeeRepository employeeRepository, CustomerRepository customerRepository,RouteRepository routeRepository){
        this.employeeRepository = employeeRepository;
        this.customerRepository = customerRepository;
        this.routeRepository = routeRepository;
    }

    public RouteModel getRouteById(String id){
      return routeRepository.findByRouteId(id);
    }

    public List<RouteModel> getAllRoutes(){     
     return routeRepository.findAll(); 
  }

    public void editRoutes(RouteModel routeModel){
      RouteModel routeModel1 =  routeRepository.findByRouteId(routeModel.getRouteId());
      routeModel1.setStartPoint(routeModel.getStartPoint());  
      routeModel1.setEndPoint(routeModel.getEndPoint());
      routeModel1.setDistance(routeModel.getDistance());

      routeRepository.save(routeModel1);
   }

   public void saveRoutes(RouteModel routeModel){
      routeRepository.save(routeModel);
   }

   public void deleteRouteById(String id){
      routeRepository.deleteRouteByRouteId(id);
   }

     public RouteModel addRoutes(RouteModel routeModel){
        routeRepository.save(routeModel);
        return routeModel;
     }
}
