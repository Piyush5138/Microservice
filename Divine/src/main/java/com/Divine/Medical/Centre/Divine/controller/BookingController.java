package com.Divine.Medical.Centre.Divine.controller;

import com.Divine.Medical.Centre.Divine.payload.BookingDto;
import com.Divine.Medical.Centre.Divine.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping
    public ResponseEntity<String>bookAnAppoinment(@RequestBody BookingDto bookingDto){
    bookingService.bookAnAppoinment(bookingDto);
    return new ResponseEntity<>("Booking is confirmed", HttpStatus.CREATED);
    }

}
