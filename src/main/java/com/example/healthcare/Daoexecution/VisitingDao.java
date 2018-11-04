package com.example.healthcare.Daoexecution;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.healthcare.entity.Visiting;


@Repository
public interface VisitingDao extends JpaRepository<Visiting, Long>{

}
