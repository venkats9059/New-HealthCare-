package com.example.healthcare.Servicesexecution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.healthcare.Daoexecution.PatientDao;
import com.example.healthcare.entity.Patient;

@Service
public class PatientServices {
	
	@Autowired
	private PatientDao patientDao;
	
	public void savePatient(Patient patient) {
		patientDao.save(patient);
		
	}

}
