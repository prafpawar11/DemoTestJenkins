package com.PageLayer.Pojo;

public class PersonalDetailsPageInPIM {

	private String expDate;
	
	private String dobDate;
	
	private boolean gender;
	
	private String country;
	
	private String ssnNumber;

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	public String getDobDate() {
		return dobDate;
	}

	public void setDobDate(String dobDate) {
		this.dobDate = dobDate;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSsnNumber() {
		return ssnNumber;
	}

	public void setSsnNumber(String ssnNumber) {
		this.ssnNumber = ssnNumber;
	}

	
	public PersonalDetailsPageInPIM() {
		super();
	}

	@Override
	public String toString() {
		return "PersonalDetailsPageInPIM [expDate=" + expDate + ", dobDate=" + dobDate + ", gender=" + gender
				+ ", country=" + country + ", ssnNumber=" + ssnNumber + "]";
	}
	
	
	
	
	
	
}
