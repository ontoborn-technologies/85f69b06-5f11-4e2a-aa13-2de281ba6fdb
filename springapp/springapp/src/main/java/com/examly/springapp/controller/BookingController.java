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
public class BookingController {

    private BookingService bookingService;

    public BookingController(BookingService bookingService){
        this.bookingService = bookingService;
    }
  
    @GetMapping("/admin/getBooking")
    public List<BookingModel> getAllBookings(){
        System.out.println("hi i am booking");
        return bookingService.getAllBookings();
    }
    
    @GetMapping("/admin/getBookingById")
    public BookingModel getBookingById(@RequestParam(defaultValue = "1" ) String id ){
        System.out.println("hi i am booking by id");
        return bookingService.getBookingById(id);
    }

    @PutMapping("/admin/saveBooking")
    public void saveNewEmployee(@RequestBody BookingModel bookingModel){
        System.out.println("hi i am booking by save id");
        bookingService.saveBooking(bookingModel);
    }
}
