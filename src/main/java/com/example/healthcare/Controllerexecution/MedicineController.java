package com.example.healthcare.Controllerexecution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.healthcare.Servicesexecution.MedicineServices;
import com.example.healthcare.entity.Medicine;

@RestController
@RequestMapping("medicine")
public class MedicineController {

	@Autowired
	private MedicineServices medicineServices;

	@PostMapping("/abab")
	public void saveMedicine(@RequestBody Medicine medicine) {
		medicineServices.saveMedicine(medicine);
	}
}
