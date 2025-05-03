package com.example.recruitmentdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class updatedata {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String companyname,studentname,roundCompleted;
	public updatedata() {
		super();
	}
	public updatedata(String companyname, String studentname, String roundCompleted ) {
		super();
		this.companyname = companyname;
		this.studentname = studentname;
		this.roundCompleted = roundCompleted;
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
	public String getstudentname() {
		return studentname;
	}
	public void setstudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getroundCompletedk() {
		return roundCompleted;
	}
	public void setroundCompletedk(String roundCompleted) {
		this.roundCompleted = roundCompleted;
	}
    

}


