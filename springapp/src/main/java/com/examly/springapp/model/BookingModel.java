package com.examly.springapp.model;

import java.lang.annotation.Inherited;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;


@Entity
@Table(name = "Booking")
public class BookingModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String bookingId;
    private int distance;
    private String startPoint;
    private String endPoint;
    private String userName;
   
    public String getBookingId() {
        return bookingId;
    }
    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }
    public int getDistance() {
        return distance;
    }
    public void setDistance(int distance) {
        this.distance = distance;
    }
    public String getStartPoint() {
        return startPoint;
    }
    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }
    public String getEndPoint() {
        return endPoint;
    } 
    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public BookingModel(String bookingId, int distance, String startPoint, String endPoint,String userName) {
        this.bookingId = bookingId;
        this.distance = distance;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.userName = userName;
    }


    public BookingModel(){}
    
}
