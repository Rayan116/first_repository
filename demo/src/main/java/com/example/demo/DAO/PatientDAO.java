package com.example.demo.DAO;

import com.example.demo.model.Patient;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
@Repository
public class PatientDAO {
        public final List<Patient> PATIENT=new ArrayList<>();

        public List<Patient> getPatient() {
                return PATIENT;
        }
        public Patient addPatient(Patient patient) {
                PATIENT.add(patient);
                return patient;
        }
        public Patient findPatientEmail(String email){
                return PATIENT.stream().filter(p->p.getEmail().equals(email)).findFirst().orElse( null);
        }
        public Patient updatePatient(Patient patient){
                var patientIndex= IntStream.range(0,PATIENT.size())
                        .filter(index->PATIENT.get(index).getEmail().equals(patient.getEmail()))
                        .findFirst()
                        .orElse(-1);
                if (patientIndex>-1){PATIENT.set(patientIndex,patient);
                return patient;
                }
                return null;
        }
        public void deletePatient(String email){
                var patientDelete=findPatientEmail(email);
                if (patientDelete!=null){
                        PATIENT.remove(patientDelete);
                }
        }

}
