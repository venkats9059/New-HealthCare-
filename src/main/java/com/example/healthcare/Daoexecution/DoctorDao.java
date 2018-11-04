package com.example.healthcare.Daoexecution;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.healthcare.entity.Doctor;

@Repository
public interface DoctorDao extends JpaRepository<Doctor, Long> {

}
