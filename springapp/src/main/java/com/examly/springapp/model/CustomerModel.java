package com.examly.springapp.model;

import java.lang.annotation.Inherited;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;


@Entity
@Table(name = "Customer")
public class CustomerModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "customer_id")
    private String customerId;

    @Column(name = "customer_name")
    private String username;

    @Column(name = "status")
    private boolean status;

    @Column(name = "email_id")
    private String email;

    @Column(name = "mobile_number")
    private Long mobilenumber;

    @Column(name = "password")
    private String password;

    public String getCustomerId() {
        return customerId;
    }
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
   
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Long getMobilenumber() {
        return mobilenumber;
    }
    public void setMobilenumber(Long mobilenumber) {
        this.mobilenumber = mobilenumber;
    }
    
    public String getPassword() {
        return password;
    }
   
    public void setPassword(String password) {
        this.password = password;
    }
    
    public CustomerModel(Long id, String customerId, String username, boolean status, String email, Long mobilenumber,
            String password) {
        this.id = id;
        this.customerId = customerId;
        this.username = username;
        this.status = status;
        this.email = email;
        this.mobilenumber = mobilenumber;
        this.password = password;
    }
   
    public CustomerModel(){
        
    }
    
       
}
