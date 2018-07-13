package com.ruby.bean;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class RegistrationBean {
	@NotEmpty
	private String firstName;
	@NotEmpty
	private String lastName;
	@NotEmpty
	@Email
	private String email;
	@NotEmpty
	private String[] profession;
	@NotEmpty
	private String[] hobby;
	public RegistrationBean() {
		// TODO Auto-generated constructor stub
	}
	public RegistrationBean(String firstName, String lastName, String email, String[] profession, String[] hobby) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.profession = profession;
		this.hobby = hobby;
	}
	public String getEmail() {
		return email;
	}
	public String getFirstName() {
		return firstName;
	}
	public String[] getHobby() {
		return hobby;
	}
	public String getLastName() {
		return lastName;
	}
	public String[] getProfession() {
		return profession;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setProfession(String[] profession) {
		this.profession = profession;
	}
}
