package com.cg.classentity;

public class Entity {
	private String firstName;
	private String lastName;
	private String dob;
	private String gender;
	private String langauge;
	private String address;
	private String city;
	private String phoneNumber;
	private String accountNumber;
	private String pan;
	private String creditCard;
	private String durationYears;
	private String rateOfInterest;
	private String loanAmount;
	private String loanType;
	private String emailId;
	
	@Override
	public String toString() {
		return "Entity [firstName=" + firstName + ", lastName=" + lastName
				+ ", dob=" + dob + ", gender=" + gender + ", langauge="
				+ langauge + ", address=" + address + ", city=" + city
				+ ", phoneNumber=" + phoneNumber + ", accountNumber="
				+ accountNumber + ", pan=" + pan + ", creditCard=" + creditCard
				+ ", durationYears=" + durationYears + ", rateOfInterest="
				+ rateOfInterest + ", loanAmount=" + loanAmount + ", loanType="
				+ loanType + ", emailId=" + emailId + "]";
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getLangauge() {
		return langauge;
	}
	public void setLangauge(String langauge) {
		this.langauge = langauge;
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}
	public String getDurationYears() {
		return durationYears;
	}
	public void setDurationYears(String durationYears) {
		this.durationYears = durationYears;
	}
	public String getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(String rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	public String getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
}
