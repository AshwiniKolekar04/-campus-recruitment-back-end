package com.example.recruitmentdemo.service;

import java.util.List;

import com.example.recruitmentdemo.model.studentregistrationform;
import org.springframework.stereotype.Service;




public interface studentregistrationformService{
	studentregistrationform save(studentregistrationform r);
	List<studentregistrationform> getAll();
	studentregistrationform search(int id);
	void delete(int id);
	studentregistrationform update(int id,studentregistrationform r);
	studentregistrationform login(String em, String password);
	

}
