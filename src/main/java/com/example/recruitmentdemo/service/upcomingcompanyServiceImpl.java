package com.example.recruitmentdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.recruitmentdemo.exception.ResourceNotFoundException;
import com.example.recruitmentdemo.model.upcomingcompany;
import com.example.recruitmentdemo.repository.upcomingcompanyRepository;

@Service
public class upcomingcompanyServiceImpl implements upcomingcompanyService  {

	
	@Autowired
	@Qualifier("viewRepo")
	private upcomingcompanyRepository viewRepo;
	
	
	
	@Override
	public upcomingcompany save(upcomingcompany r) {
		// TODO Auto-generated method stub
		return viewRepo.save(r);
	}

	@Override
	public List<upcomingcompany> getAll() {
		// TODO Auto-generated method stub
		return viewRepo.findAll();
	}

	@Override
	public upcomingcompany search(int id) {
		upcomingcompany r=viewRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Resource Not Found with id"+id));	
			return r;
	}

	@Override
	public void delete(int id) {
		upcomingcompany r=viewRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Resource Not Found with id"+id));
		viewRepo.deleteById(id);
	}

	@Override
	public upcomingcompany update(int id, upcomingcompany r) {
		upcomingcompany rold=viewRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Resource Not Found with id"+id));
          rold.setCompanyname(r.getCompanyname());
          rold.setDuedate(r.getDuedate());
          rold.setRegistrationlink(r.getRegistrationlink());
		return viewRepo.save(rold) ;
	}

	

	

}
