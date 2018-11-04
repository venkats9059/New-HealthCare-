package com.example.healthcare.Controllerexecution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.healthcare.Servicesexecution.PatientServices;
import com.example.healthcare.entity.Patient;

@RestController
@RequestMapping("patient")
public class PatientContrller {

	@Autowired
	private PatientServices patientServices;

	@PostMapping("/abc")
	public void savePatient(@RequestBody Patient patient) {
		patientServices.savePatient(patient);

	}

}
