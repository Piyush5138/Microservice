package com.Divine.Medical.Centre.Divine.service;

import com.Divine.Medical.Centre.Divine.entity.Doctor;
import com.Divine.Medical.Centre.Divine.entity.Patient;
import com.Divine.Medical.Centre.Divine.entity.Review;
import com.Divine.Medical.Centre.Divine.repository.DoctorRepository;
import com.Divine.Medical.Centre.Divine.repository.PatientRepository;
import com.Divine.Medical.Centre.Divine.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

;import java.util.List;

@Service
public class ReviewService {

    @Autowired
    private DoctorRepository doctorRepo;
    @Autowired
    private PatientRepository patientRepo;

    @Autowired
    private ReviewRepository reviewRepo;

    public Review createReview(Review review) {

        Doctor doctor = doctorRepo.findById(review.getDoctorId()).get();
        Patient patient = patientRepo.findById(review.getPatientId()).get();

        Review savedReview = null;

        if (doctor != null || patient != null) {
            savedReview = reviewRepo.save(review);
        }
        return savedReview;
    }
    //custom methode
    public List<Review> getReviewByDoctorId(long doctorId){
        List<Review> reviews = reviewRepo.findByDoctorId(doctorId);
        return reviews;

    }

}
