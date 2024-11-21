package com.example.demo.controller;

import com.example.demo.model.Patient;
import com.example.demo.service.ServicePatient;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/health/patient")
@AllArgsConstructor
public class ControllerPatient {
    private final ServicePatient servicePatient;
    @GetMapping
    public List<Patient> getPatient() {
        return servicePatient.getPatients();
    }

    @PostMapping("add_patient")
    public Patient addPatient(@RequestBody Patient patient) {
        return servicePatient.addPatient(patient);
    }
    @GetMapping("/{email}")
    public Patient getPatientByEmail(@PathVariable("email") String email) {
        return servicePatient.getPatientEmail(email);
    }
    @PutMapping("update_patient")
    public Patient updatePatient( Patient patient) {
        return servicePatient.updatePatient(patient);
    }
    @DeleteMapping("delete_patient/{email}")
    public void deletePatient(@PathVariable("email") String email) {
        servicePatient.deletePatient(email);
    }
}
