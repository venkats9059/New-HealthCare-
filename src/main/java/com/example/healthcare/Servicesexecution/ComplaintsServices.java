package com.example.healthcare.Servicesexecution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.healthcare.Daoexecution.ComplaintsDao;
import com.example.healthcare.entity.Complaints;

@Service
public class ComplaintsServices {

	@Autowired
	private ComplaintsDao complaintsDao;
	
	public void saveComplaints(Complaints complaints)
	{
		complaintsDao.save(complaints);
	}
}
