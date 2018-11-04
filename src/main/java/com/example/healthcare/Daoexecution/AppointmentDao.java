package com.example.healthcare.Daoexecution;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.healthcare.entity.Appointment;

@Repository
public interface AppointmentDao extends JpaRepository<Appointment, Long>{

}
