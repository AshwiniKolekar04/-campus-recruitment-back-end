package com.example.recruitmentdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class coordinator {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
	private String email,password;
	public coordinator() {
		super();
		// TODO Auto-generated constructor stub
	}
	public coordinator(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
