package com.PageLayer.Pojo;

public class AddNewUserInPIMPage {

	private String firstname;
	
	private String middlename;
	
	private String lastname;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public AddNewUserInPIMPage() {
		super();
	}

	@Override
	public String toString() {
		return "AddNewUserInPIMPage [firstname=" + firstname + ", middlename=" + middlename + ", lastname=" + lastname
				+ "]";
	}
	
	
	
	
}
