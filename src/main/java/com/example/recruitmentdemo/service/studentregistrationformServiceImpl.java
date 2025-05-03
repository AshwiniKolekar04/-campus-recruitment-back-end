package com.example.recruitmentdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.recruitmentdemo.exception.ResourceNotFoundException;
import com.example.recruitmentdemo.model.studentregistrationform;
import com.example.recruitmentdemo.repository.studentregistrationformRepository;

@Service
public abstract class studentregistrationformServiceImpl implements studentregistrationformService {
     
	@Autowired
	@Qualifier("regRepo")
	private studentregistrationformRepository regRepo;
	
	@Override
	public studentregistrationform save(studentregistrationform r) {
		// TODO Auto-generated method stub
		return  regRepo.save(r) ;
	}

	@Override
	public List<studentregistrationform> getAll() {
		// TODO Auto-generated method stub
		return  regRepo.findAll();
	}

	@Override
	public studentregistrationform search(int id) {
		studentregistrationform r=regRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("resource not found with id"+id));
		return r;
	}

	@Override
	public void delete(int id) {
		studentregistrationform r=regRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("resource not found with id"+id));
		regRepo.deleteById(id);
	}

	@Override
	public studentregistrationform update(int id, studentregistrationform r) {
		studentregistrationform rold=regRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("resource not found with id"+id));
       rold.setEnterclass(r.getEnterclass());
       rold.setEnterprnno(r.getEnterprnno());
       rold.setCountry(r.getCountry());
       rold.setDateofbirth(r.getDateofbirth());
       rold.setBca(r.getBca());
       rold.setpassword(r.getpassword());
       rold.setEducation(r.getEducation());
       rold.setEmail(r.getEmail());
       rold.setEnterabcid(r.getEnterabcid());
       rold.setEnterrollno(r.getEnterrollno());
       rold.setMediumofeducation(r.getMediumofeducation());
       rold.setMobileno(r.getMobileno());
       rold.setName(r.getName());
       rold.setPermentadress(r.getPermentadress());
       rold.setProgram(r.getProgram());
       rold.setState(r.getState());
       rold.setWhatsappno(r.getWhatsappno());
       rold.setTwelththpercentage(r.getTwelththpercentage());
       rold.setTenthboardexamination(r.getTenthboardexamination());
       rold.setTwelththboardexamination(r.getTwelththboardexamination());
       rold.setTenthpassingyear(r.getTenthpassingyear());
       rold.setTenthpassingyear(r.getTwelththpassingyear());
		return regRepo.save(rold);
	}
	@Override
	public studentregistrationform login(String email, String password) {
		// TODO Auto-generated method stub
		return regRepo.findByEmailAndPassword(email,password);
		

	}
	

}
