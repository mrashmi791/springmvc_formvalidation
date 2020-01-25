package com.practice.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

public class SignUpForm {

	@NotNull(message = "Firstname should not empty")
	@Size(min = 3, message = ("length should be greater then 3"))

	private String firstName;

	private String lastName;
	@NotNull(message = "Email should not empty")
	@Email(message = "Invalid email! Please enter valid email")
	private String email;

	@NotNull(message = "username should not empty")
	private String userName;

	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digits ")
	private String password;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
