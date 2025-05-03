package com.example.recruitmentdemo.service;

import java.util.List;

import com.example.recruitmentdemo.model.upcomingcompany;

public interface upcomingcompanyService {
	upcomingcompany save(upcomingcompany r);
	List<upcomingcompany> getAll();
	upcomingcompany search(int id);
	void delete(int id);
	upcomingcompany update(int id,upcomingcompany r);
	
}
