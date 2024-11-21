package com.example.demo.service;

import com.example.demo.model.Patient;

import java.util.List;

public interface Service {

    List<Patient> getPatients();
    Patient addPatient(Patient patient);
    Patient updatePatient(Patient patient);
    Patient getPatientEmail(String email);
    void deletePatient(String email);

}
