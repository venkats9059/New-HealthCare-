package com.example.healthcare.Controllerexecution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.healthcare.Servicesexecution.ComplaintsServices;
import com.example.healthcare.entity.Complaints;

@RestController
@RequestMapping("complaints")
public class ComplaintsController {

	@Autowired
	private ComplaintsServices complaintsServices;

	@PostMapping("/pqr")
	public void saveComplaints(@RequestBody Complaints complaints) {
		complaintsServices.saveComplaints(complaints);
	}

}
