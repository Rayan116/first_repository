package com.example.demo.service;

import com.example.demo.DAO.PatientDAO;
import com.example.demo.model.Patient;
import lombok.AllArgsConstructor;

import java.util.List;
@org.springframework.stereotype.Service
@AllArgsConstructor
public class ServicePatient implements Service {
   private final PatientDAO patientDAO;

   @Override
    public List<Patient> getPatients() {
        return patientDAO.getPatient();
    }

    @Override
    public Patient addPatient(Patient patient) {
        return patientDAO.addPatient(patient);
    }

    @Override
    public Patient updatePatient(Patient patient) {
        return patientDAO.updatePatient(patient);
    }

    @Override
    public Patient getPatientEmail(String email) {
        return patientDAO.findPatientEmail(email);
    }

    @Override
    public void deletePatient(String email) {
patientDAO.deletePatient(email);
    }
}
