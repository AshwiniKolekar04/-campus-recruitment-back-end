package com.example.recruitmentdemo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.recruitmentdemo.model.coordinator;

@Repository
@Qualifier ("coorRepo")
public interface coordinatorRepository extends JpaRepository<coordinator, Integer>{
  coordinator findByEmailAndPassword(String email, String password);
}
