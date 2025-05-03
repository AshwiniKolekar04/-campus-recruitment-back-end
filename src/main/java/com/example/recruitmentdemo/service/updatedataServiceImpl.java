package com.example.recruitmentdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.recruitmentdemo.exception.ResourceNotFoundException;
import com.example.recruitmentdemo.model.updatedata;
import com.example.recruitmentdemo.repository.updatedataRepository;

@Service
public class updatedataServiceImpl implements updatedataService  {

	
	@Autowired
	@Qualifier("updateRepo")
	private updatedataRepository updateRepo;
	
	
	
	@Override
	public updatedata save(updatedata r) {
		// TODO Auto-generated method stub
		return updateRepo.save(r);
	}

	@Override
	public List<updatedata> getAll() {
		// TODO Auto-generated method stub
		return updateRepo.findAll();
	}

	@Override
	public updatedata search(int id) {
		updatedata r=updateRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Resource Not Found with id"+id));	
			return r;
	}

	@Override
	public void delete(int id) {
		updatedata r=updateRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Resource Not Found with id"+id));
		updateRepo.deleteById(id);
	}

	@Override
	public updatedata update(int id, updatedata r) {
		updatedata rold=updateRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Resource Not Found with id"+id));
          rold.setCompanyname(r.getCompanyname());
          rold.setstudentname(r.getstudentname());
          rold.setCompanyname(r.getroundCompletedk());
		return updateRepo.save(rold) ;
	}

	

	
	

}
