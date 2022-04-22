package com.examly.springapp.service;

import org.springframework.web.bind.annotation.*;
import com.examly.springapp.repository.*;
import com.examly.springapp.model.*;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.*;
import java.util.*;

@Service
public class BookingService {    

    private CustomerRepository customerRepository;
    private RouteRepository routeRepository;
    private BookingRepository bookingRepository;


    public BookingService(BookingRepository bookingRepository, CustomerRepository customerRepository,RouteRepository routeRepository){
        this.bookingRepository = bookingRepository;
        this.customerRepository = customerRepository;
        this.routeRepository = routeRepository;
    }

    public BookingModel getBookingById(String id){
       return bookingRepository.findByBookingId(id);
    }

    public List<BookingModel> getAllBookings(){     
     return bookingRepository.findAll(); 
  }

   public void saveBooking(BookingModel bookingModel){
      bookingRepository.save(bookingModel);
   }

}
