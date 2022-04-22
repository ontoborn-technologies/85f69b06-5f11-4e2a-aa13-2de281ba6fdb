package com.examly.springapp.repository;
import org.springframework.web.bind.annotation.*;
import com.examly.springapp.model.*;
import org.springframework.http.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;
import java.util.*;

@Repository
public interface BookingRepository extends JpaRepository<BookingModel,Long> {

    List<BookingModel> findAll(); 
    BookingModel findByBookingId(String id);
    BookingModel findByStartPoint(String startPoint);
}
