package com.example.healthcare.Servicesexecution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.healthcare.Daoexecution.MedicineDao;
import com.example.healthcare.entity.Medicine;

@Service
public class MedicineServices {

	@Autowired
	private MedicineDao medicineDao;

	public void saveMedicine(Medicine medicine) {

		medicineDao.save(medicine);
	}
}
