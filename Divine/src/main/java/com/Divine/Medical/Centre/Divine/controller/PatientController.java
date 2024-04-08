package com.Divine.Medical.Centre.Divine.controller;

import com.Divine.Medical.Centre.Divine.entity.Patient;
import com.Divine.Medical.Centre.Divine.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping

    public ResponseEntity<Patient> createPatient(@RequestBody Patient patient){
        return new ResponseEntity<>(patientService.createPatient(patient), HttpStatus.CREATED);
    }

}
