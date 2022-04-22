package com.examly.springapp.model;
import java.lang.annotation.Inherited;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;

@Entity
@Table(name = "Employee")
public class EmployeeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String userName;
    private String password;
    private String email;
    private Long mobileNumber;
    private String vehicleModel;
    private String vehicleNumber;
    private boolean verfied;
    private boolean active;
       
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public Long getMobileNumber(){
        return mobileNumber;
    }
    public void setMobileNumber(Long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public String getVehicleModel() {
        return vehicleModel;
    }
    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }
    public String getVehicleNumber() {
        return vehicleNumber;
    }
    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
    public boolean isVerfied() {
        return verfied;
    }
    public void setVerfied(boolean verfied) {
        this.verfied = verfied;
    }
    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
    public EmployeeModel(String userName, String password, String email, Long mobileNumber, String vehicleModel,
            String vehicleNumber, boolean verfied, boolean active) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.vehicleModel = vehicleModel;
        this.vehicleNumber = vehicleNumber;
        this.verfied = verfied;
        this.active = active;
    }
    
    public EmployeeModel(){

    }
}
