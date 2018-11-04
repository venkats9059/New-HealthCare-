package com.example.healthcare.Daoexecution;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.healthcare.entity.Patient;

@Repository
public interface PatientDao extends JpaRepository<Patient, Long> {

}
