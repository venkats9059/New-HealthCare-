package com.example.healthcare.Servicesexecution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.healthcare.Daoexecution.DoctorDao;
import com.example.healthcare.entity.Doctor;

@Service
public class DoctorServices {
	
	@Autowired
	private DoctorDao doctorDao;
	public void saveDoctor(Doctor doctor) {
		doctorDao.save(doctor);
		
	}

}
