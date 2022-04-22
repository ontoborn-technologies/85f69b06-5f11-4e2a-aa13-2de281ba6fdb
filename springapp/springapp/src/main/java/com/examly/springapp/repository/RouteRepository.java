package com.examly.springapp.repository;
import org.springframework.web.bind.annotation.*;
import com.examly.springapp.model.*;
import org.springframework.http.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;
import java.util.*;

@Repository
public interface RouteRepository extends JpaRepository<RouteModel,Long> {

    List<RouteModel> findAll(); 
    RouteModel findByRouteId(String id);
    RouteModel deleteRouteByRouteId(String id);
    RouteModel findByStartPoint(String startPoint);
}
