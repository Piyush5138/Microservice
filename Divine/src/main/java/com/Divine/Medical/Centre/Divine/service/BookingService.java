package com.Divine.Medical.Centre.Divine.service;


import com.Divine.Medical.Centre.Divine.entity.Booking;
import com.Divine.Medical.Centre.Divine.payload.BookingDto;
import com.Divine.Medical.Centre.Divine.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepo;
    public void bookAnAppoinment(BookingDto dto){
        List<String> availableTimeSlots=new ArrayList<>();
        availableTimeSlots.add("10:15 AM");
        availableTimeSlots.add("11:15 AM");
        availableTimeSlots.add("12:15 PM");

        Booking booking = new Booking();

        for (String slots:availableTimeSlots){
            if (slots.equals(dto.getBookingTime())){
                booking.setBookingTime(dto.getBookingTime());
                availableTimeSlots.remove(slots);
            }
        }
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(() -> {
            System.out.println("Code executed every 24 hours");
            availableTimeSlots.add("10:15 AM");
            availableTimeSlots.add("11:15 AM");
            availableTimeSlots.add("12:15 PM");
        }, 0, 24, TimeUnit.HOURS);

          booking.setDoctorId(dto.getDoctorId());
          booking.setPatientId(dto.getPatientId());

         if (booking.getBookingTime()!=null){
             bookingRepo.save(booking);

         }else {
        System.out.println("Time Slot Is Not Available");
    }

}
    }




