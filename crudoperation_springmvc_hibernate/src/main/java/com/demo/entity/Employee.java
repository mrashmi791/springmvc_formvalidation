package com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

@Entity
@Table(name= "employee")
public class Employee {
	
 	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
 	
	private int id;
 	
 	
 	@Column(name = "emp_name")
 	@NotNull(message = "Name should not empty")
	@Size(min = 3, message = ("length should be greater then 3"))

	private String name;
 	
 	@Column
 	@NotNull(message = "Email should not empty")
	@Email(message = "Invalid email! Please enter valid email")	
	private String email;
 	
 	@Column
 	@NotNull(message = "username should not empty")
	private String address;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + "]";
	}
	
	

}
