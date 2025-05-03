package com.example.recruitmentdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class upcomingcompany {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String companyname,duedate,registrationlink;
	public upcomingcompany() {
		super();
	}
	public upcomingcompany(String companyname, String duedate, String registrationlink) {
		super();
		this.companyname = companyname;
		this.duedate = duedate;
		this.registrationlink = registrationlink;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getDuedate() {
		return duedate;
	}
	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}
	public String getRegistrationlink() {
		return registrationlink;
	}
	public void setRegistrationlink(String registrationlink) {
		this.registrationlink = registrationlink;
	}
    

}
