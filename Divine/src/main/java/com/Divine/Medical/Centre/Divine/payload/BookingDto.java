package com.Divine.Medical.Centre.Divine.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingDto {
    private long doctorId;
    private long patientId;
    private String bookingTime;

}
