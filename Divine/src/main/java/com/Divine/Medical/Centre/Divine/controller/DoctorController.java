package com.Divine.Medical.Centre.Divine.controller;


import com.Divine.Medical.Centre.Divine.entity.Doctor;
import com.Divine.Medical.Centre.Divine.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @PostMapping("/add")
    public ResponseEntity<Doctor> addDoctor(@RequestBody Doctor doctor) {
        Doctor savedDoctor = doctorService.addDoctor(doctor);
        return new ResponseEntity<>(savedDoctor, HttpStatus.CREATED);
    }

    @GetMapping("/search")
    public List<Doctor>searchDoctors(@RequestParam String search){
        return doctorService.searchDoctorsByNameOrSpecialization(search);
    }
}
