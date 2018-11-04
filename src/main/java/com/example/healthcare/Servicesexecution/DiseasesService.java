package com.example.healthcare.Servicesexecution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.healthcare.Daoexecution.DiseasesDao;
import com.example.healthcare.entity.Diseases;

@Service
public class DiseasesService {

	@Autowired
	private DiseasesDao diseasesDao;

	public void saveDiseases(Diseases diseases) {
		diseasesDao.save(diseases);

	}

}
