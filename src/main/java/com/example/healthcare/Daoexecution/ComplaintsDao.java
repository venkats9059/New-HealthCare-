package com.example.healthcare.Daoexecution;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.healthcare.entity.Complaints;

@Repository
public interface ComplaintsDao extends JpaRepository<Complaints, Long>{

}
