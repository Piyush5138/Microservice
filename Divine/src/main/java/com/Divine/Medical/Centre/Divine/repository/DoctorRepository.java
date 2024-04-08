package com.Divine.Medical.Centre.Divine.repository;

import com.Divine.Medical.Centre.Divine.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    @Query("SELECT d FROM Doctor d WHERE LOWER(d.name) LIKE %:search% OR LOWER(d.specialization) LIKE %:search%")
    List<Doctor> searchByNameOrSpecialization(@Param("search") String search);
}

