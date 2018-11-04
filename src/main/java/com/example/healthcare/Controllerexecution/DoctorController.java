package com.example.healthcare.Controllerexecution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.healthcare.Servicesexecution.DoctorServices;
import com.example.healthcare.entity.Doctor;

@RestController
@RequestMapping("doctor")
public class DoctorController {
	
	@Autowired
	private DoctorServices doctorServices;
	
	@PostMapping("/abcd")
	public void saveDoctor(@RequestBody Doctor doctor) {
		doctorServices.saveDoctor(doctor);
		
	}
}
