package com.Divine.Medical.Centre.Divine.service;


import com.Divine.Medical.Centre.Divine.entity.Doctor;
import com.Divine.Medical.Centre.Divine.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public Doctor addDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }


    public List<Doctor> searchDoctorsByNameOrSpecialization(String search) {
        return doctorRepository.searchByNameOrSpecialization(search);
    }
}


