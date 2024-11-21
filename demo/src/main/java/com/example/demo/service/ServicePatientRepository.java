package com.example.demo.service;


import com.example.demo.DAO.Repository;
import com.example.demo.model.Patient;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;

import java.util.List;
@org.springframework.stereotype.Service
@AllArgsConstructor
@Primary
public class ServicePatientRepository implements Service {
    private final Repository repository;

    @Override
    public List<Patient> getPatients() {
        return repository.findAll();
    }

    @Override
    public Patient addPatient(Patient patient) {
        return repository.save(patient);
    }

    @Override
    public Patient updatePatient(Patient patient) {
        return repository.save(patient);
    }

    @Override
    public Patient getPatientEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public void deletePatient(String email) {
repository.deleteByEmail(email);
    }
}