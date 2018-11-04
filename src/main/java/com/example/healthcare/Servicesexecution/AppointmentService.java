package com.example.healthcare.Servicesexecution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.healthcare.Daoexecution.AppointmentDao;
import com.example.healthcare.entity.Appointment;

@Service
public class AppointmentService {
	
	
	@Autowired
	private AppointmentDao appointmentDao;
	public void saveAppointmentDao(Appointment appointment) {
		appointmentDao.save(appointment);
	}

}
