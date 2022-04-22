package com.examly.springapp.repository;
import org.springframework.web.bind.annotation.*;
import com.examly.springapp.model.*;
import org.springframework.http.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;
import java.util.*;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerModel,Long> {

    List<CustomerModel> findAll(); 
    CustomerModel findByCustomerId(String id);
    CustomerModel findByEmail(String email);
    // CustomerModel save(CustomerModel customerModel);

}
