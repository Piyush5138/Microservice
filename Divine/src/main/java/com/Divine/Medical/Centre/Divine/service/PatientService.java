package com.Divine.Medical.Centre.Divine.service;

import com.Divine.Medical.Centre.Divine.entity.Patient;
import com.Divine.Medical.Centre.Divine.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public Patient createPatient(Patient patient){
        Patient savedPatient = patientRepository.save(patient);
        return patient;

    }
}
