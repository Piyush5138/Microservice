package com.Divine.Medical.Centre.Divine.payload;

import com.Divine.Medical.Centre.Divine.entity.Doctor;
import com.Divine.Medical.Centre.Divine.entity.Review;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DoctorDto {
    private Doctor doctor;
    private List<Review> reviews;
   private double ratingPercentage;
}
