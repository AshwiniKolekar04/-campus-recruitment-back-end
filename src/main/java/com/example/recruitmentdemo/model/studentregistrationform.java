package com.example.recruitmentdemo.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class studentregistrationform {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name,program,enterclass,email,password,whatsappno,permentadress,country,state,mediumofeducation,tenthboardexamination,
	 twelththboardexamination,education,  bca,mobileno,dateofbirth,enterrollno,enterprnno,enterabcid,tenthpassingyear,twelththpassingyear;
	 private double twelththpercentage,tenthpercentage,I,II,III,IV;

	public studentregistrationform() {
		super();
       
	}

	public studentregistrationform(String name, String program, String enterclass, String email,String password, String whatsappno,
			String permentadress, String country, String state, String mediumofeducation, String tenthboardexamination,
			String twelththboardexamination, String education, String bca,  String mobileno,
			String dateofbirth, String enterrollno, String enterprnno, String enterabcid, String tenthpassingyear,
			String twelththpassingyear, double twelththpercentage, double tenthpercentage, double i, double iI,
			double iII, double iV) {
		super();
		this.name = name;
		this.program = program;
		this.enterclass = enterclass;
		this.email = email;
		this.whatsappno = whatsappno;
		this.permentadress = permentadress;
		this.country = country;
		this.state = state;
		this.mediumofeducation = mediumofeducation;
		this.tenthboardexamination = tenthboardexamination;
		this.twelththboardexamination = twelththboardexamination;
		this.education = education;
		this.bca = bca;
		this.password=password;
		this.mobileno = mobileno;
		this.dateofbirth = dateofbirth;
		this.enterrollno = enterrollno;
		this.enterprnno = enterprnno;
		this.enterabcid = enterabcid;
		this.tenthpassingyear = tenthpassingyear;
		this.twelththpassingyear = twelththpassingyear;
		this.twelththpercentage = twelththpercentage;
		this.tenthpercentage = tenthpercentage;
		I = i;
		II = iI;
		III = iII;
		IV = iV;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public String getEnterclass() {
		return enterclass;
	}

	public void setEnterclass(String enterclass) {
		this.enterclass = enterclass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getpassword() {
		return password;
	}

	public void setpassword(String password) {
		this.password = password;
	}

	public String getWhatsappno() {
		return whatsappno;
	}

	public void setWhatsappno(String whatsappno) {
		this.whatsappno = whatsappno;
	}

	public String getPermentadress() {
		return permentadress;
	}

	public void setPermentadress(String permentadress) {
		this.permentadress = permentadress;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getMediumofeducation() {
		return mediumofeducation;
	}

	public void setMediumofeducation(String mediumofeducation) {
		this.mediumofeducation = mediumofeducation;
	}

	public String getTenthboardexamination() {
		return tenthboardexamination;
	}

	public void setTenthboardexamination(String tenthboardexamination) {
		this.tenthboardexamination = tenthboardexamination;
	}

	public String getTwelththboardexamination() {
		return twelththboardexamination;
	}

	public void setTwelththboardexamination(String twelththboardexamination) {
		this.twelththboardexamination = twelththboardexamination;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getBca() {
		return bca;
	}

	public void setBca(String bca) {
		this.bca = bca;
	}

	

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getEnterrollno() {
		return enterrollno;
	}

	public void setEnterrollno(String enterrollno) {
		this.enterrollno = enterrollno;
	}

	public String getEnterprnno() {
		return enterprnno;
	}

	public void setEnterprnno(String enterprnno) {
		this.enterprnno = enterprnno;
	}

	public String getEnterabcid() {
		return enterabcid;
	}

	public void setEnterabcid(String enterabcid) {
		this.enterabcid = enterabcid;
	}

	public String getTenthpassingyear() {
		return tenthpassingyear;
	}

	public void setTenthpassingyear(String tenthpassingyear) {
		this.tenthpassingyear = tenthpassingyear;
	}

	public String getTwelththpassingyear() {
		return twelththpassingyear;
	}

	public void setTwelththpassingyear(String twelththpassingyear) {
		this.twelththpassingyear = twelththpassingyear;
	}

	public double getTwelththpercentage() {
		return twelththpercentage;
	}

	public void setTwelththpercentage(double twelththpercentage) {
		this.twelththpercentage = twelththpercentage;
	}

	public double getTenthpercentage() {
		return tenthpercentage;
	}

	public void setTenthpercentage(double tenthpercentage) {
		this.tenthpercentage = tenthpercentage;
	}

	public double getI() {
		return I;
	}

	public void setI(double i) {
		I = i;
	}

	public double getII() {
		return II;
	}

	public void setII(double iI) {
		II = iI;
	}

	public double getIII() {
		return III;
	}

	public void setIII(double iII) {
		III = iII;
	}

	public double getIV() {
		return IV;
	}

	public void setIV(double iV) {
		IV = iV;
	}

	
	
}