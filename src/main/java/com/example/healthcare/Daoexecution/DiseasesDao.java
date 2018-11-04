package com.example.healthcare.Daoexecution;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.healthcare.entity.Diseases;

@Repository
public interface DiseasesDao extends JpaRepository<Diseases, Long>{

}
