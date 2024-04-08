package com.Divine.Medical.Centre.Divine.repository;

import com.Divine.Medical.Centre.Divine.entity.Patient;
import com.Divine.Medical.Centre.Divine.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {



}
