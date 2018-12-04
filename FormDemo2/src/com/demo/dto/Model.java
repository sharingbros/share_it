package com.demo.dto;

public class Model {

	private String fname;
	private String lname;
	private String gender;
	private String lang;
	private String address;
	private String city;
	private String email;
	private String mobile;
	private String accno;
	private String pan;
	private String card;
	private int years;
	private double interest;
	private double loanAmt;
	private String loanType;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAccno() {
		return accno;
	}

	public void setAccno(String accno) {
		this.accno = accno;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public double getLoanAmt() {
		return loanAmt;
	}

	public void setLoanAmt(double loanAmt) {
		this.loanAmt = loanAmt;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	@Override
	public String toString() {
		return "Model [fname=" + fname + ", lname=" + lname + ", gender="
				+ gender + ", lang=" + lang + ", address=" + address
				+ ", city=" + city + ", email=" + email + ", mobile=" + mobile
				+ ", accno=" + accno + ", pan=" + pan + ", card=" + card
				+ ", years=" + years + ", interest=" + interest + ", loanAmt="
				+ loanAmt + ", loanType=" + loanType + "]";
	}

}
