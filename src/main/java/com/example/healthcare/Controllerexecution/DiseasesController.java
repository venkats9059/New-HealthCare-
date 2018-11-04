package com.example.healthcare.Controllerexecution;

import javax.persistence.SqlResultSetMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.healthcare.Servicesexecution.DiseasesService;
import com.example.healthcare.entity.Diseases;

@RestController
@RequestMapping("diseases")
public class DiseasesController {

	@Autowired
	private DiseasesService diseasesService;

	@PostMapping("/abcde")
	public void saveDiseases(@RequestBody Diseases diseases) {
		diseasesService.saveDiseases(diseases);

	}

}
