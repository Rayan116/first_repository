package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.Period;

@Data
@Entity
@Table(name="patients")
public class Patient {
    @Id
    @GeneratedValue
    private Long id;

    private String firstName;

    private String lastname;
    @Transient
    private int age;
    @Column(unique = true)
    private String email;

    private LocalDate dateOfBirth;

    private String gender;

    private String address;
    public int getAge() {
        return Period.between(dateOfBirth,LocalDate.now()).getYears();
    }
}
