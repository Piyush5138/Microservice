package com.Divine.Medical.Centre.Divine.repository;

import com.Divine.Medical.Centre.Divine.entity.Booking;
import com.Divine.Medical.Centre.Divine.payload.BookingDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking,Long> {

}
