package com.example.recruitmentdemo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.recruitmentdemo.model.coordinator;
import com.example.recruitmentdemo.model.studentregistrationform;


@Repository
@Qualifier("regRepo")
public interface studentregistrationformRepository extends JpaRepository<studentregistrationform, Integer>{

	studentregistrationform findByEmailAndPassword(String em, String password);
	
}

