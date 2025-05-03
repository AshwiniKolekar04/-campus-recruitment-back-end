package com.example.recruitmentdemo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.recruitmentdemo.model.student;
import com.example.recruitmentdemo.repository.studentRepository;

@Service
public class studentServiceImpl implements studentService
{
	@Autowired
	@Qualifier("studRepo")
	private studentRepository studRepo;

	@Override
	public student save(student a) {
		// TODO Auto-generated method stub
		return studRepo.save(a);
	}

	@Override
	public student login(String em, String ps) {
		
		return studRepo.findByEmailAndPassword(em, ps);
	}

}
