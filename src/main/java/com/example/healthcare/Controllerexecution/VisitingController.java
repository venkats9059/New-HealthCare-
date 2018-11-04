package com.example.healthcare.Controllerexecution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.healthcare.Servicesexecution.VisitingServices;
import com.example.healthcare.entity.Visiting;

@RestController
@RequestMapping("visiting")
public class VisitingController {

	@Autowired
	private VisitingServices visitingServices;
	@PostMapping("/indone")
	public void saveVisiting(@RequestBody Visiting visiting) {
		visitingServices.saveVisiting(visiting);
	}

}
