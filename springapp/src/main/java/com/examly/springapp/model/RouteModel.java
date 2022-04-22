package com.examly.springapp.model;

import java.lang.annotation.Inherited;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;


@Entity
@Table(name = "Route")
public class RouteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String routeId;
    private int distance;
    private String startPoint;
    private String endPoint;
    public String getRouteId() {
        return routeId;
    }
    public void setRouteId(String routeId) {
        this.routeId = routeId;
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
    public RouteModel(String routeId, int distance, String startPoint, String endPoint) {
        this.routeId = routeId;
        this.distance = distance;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public RouteModel(){}
    
}
