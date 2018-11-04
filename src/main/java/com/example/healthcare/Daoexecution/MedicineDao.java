package com.example.healthcare.Daoexecution;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.healthcare.entity.Medicine;

@Repository
public interface MedicineDao extends JpaRepository<Medicine, Long>{

}
