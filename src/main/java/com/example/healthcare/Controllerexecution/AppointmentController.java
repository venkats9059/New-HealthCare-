package com.example.healthcare.Controllerexecution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.healthcare.Servicesexecution.AppointmentService;
import com.example.healthcare.entity.Appointment;

@RestController
@RequestMapping("appointment")
public class AppointmentController {

	@Autowired
	private AppointmentService AppointmentService;

	@PostMapping("/ind")
	public void saveAppointmentDao(@RequestBody Appointment appointment) {
		AppointmentService.saveAppointmentDao(appointment);
	}

}
