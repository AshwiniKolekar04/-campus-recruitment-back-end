package com.example.recruitmentdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.recruitmentdemo.model.coordinator;
import com.example.recruitmentdemo.repository.coordinatorRepository;

@Service
public class coordinatorServiceImpl implements coordinatorService
{
	@Autowired
	@Qualifier("coorRepo")
	private coordinatorRepository coorRepo;

	@Override
	public coordinator save(coordinator a) {
		// TODO Auto-generated method stub
		return coorRepo.save(a);
	}

	@Override
	public coordinator login(String em, String ps) {
		
		return coorRepo.findByEmailAndPassword(em, ps);
	}

}
