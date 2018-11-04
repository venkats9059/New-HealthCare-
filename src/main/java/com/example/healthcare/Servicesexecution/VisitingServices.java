package com.example.healthcare.Servicesexecution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.healthcare.Daoexecution.VisitingDao;
import com.example.healthcare.entity.Visiting;

@Service
public class VisitingServices {
	
	@Autowired
	private VisitingDao visitingDao;
	
	public void saveVisiting(Visiting visiting) {
		visitingDao.save(visiting);
	}

}
