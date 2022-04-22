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
public class RouteController {

    private RouteService routeService;

    public RouteController(RouteService routeService){
        this.routeService = routeService;
    }
  
    @GetMapping("/route")
    public List<RouteModel> getAllRoutes(){
        System.out.println("hi i am route");
        return routeService.getAllRoutes();
    }

    
    @GetMapping("/route/{id}")
    public RouteModel getRouteById(@PathVariable String id ){
        System.out.println("hi i am routr by id");
        return routeService.getRouteById(id);
    }

    @PutMapping("/editRoute")
    public void editEmployeeById(@RequestBody RouteModel routeModel){
        System.out.println("hi i am route by edit id");
        routeService.editRoutes(routeModel);
    }

    @PutMapping("/saveRoute")
    public void saveNewEmployee(@RequestBody RouteModel routeModel){
        System.out.println("hi i am route by save id");
        routeService.saveRoutes(routeModel);
    }

    @DeleteMapping("/deleteRoute")
    public void deleteEmployeeById(@RequestParam String id ){
        System.out.println("hi i am route by delete id");
        routeService.deleteRouteById(id);
    }
}
