package com.example.recruitmentdemo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.recruitmentdemo.model.Registration;
@Repository
@Qualifier("resRepo")
public interface RegistrationRepository extends JpaRepository<Registration, Integer> {
	List<Registration> findAllByEmailAndPassword(String email,String password);
}
