package com.example.recruitmentdemo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.recruitmentdemo.model.updatedata;
@Repository
@Qualifier("updateRepo")
public interface updatedataRepository extends JpaRepository<updatedata, Integer>{

	
}