package com.example.recruitmentdemo.service;

import java.util.List;

import com.example.recruitmentdemo.model. updatedata;

public interface updatedataService {
	 updatedata save( updatedata r);
	List< updatedata> getAll();
	 updatedata search(int id);
	void delete(int id);
	 updatedata update(int id, updatedata r);
	

}
