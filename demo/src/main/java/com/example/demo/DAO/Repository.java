package com.example.demo.DAO;

import com.example.demo.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Patient,Long> {
    void deleteByEmail(String email);
    Patient findByEmail(String email);
}

