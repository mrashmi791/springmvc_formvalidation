package com.rashmi.jpa.practice.service;

import java.util.List;

import com.rashmi.jpa.practice.entity.Student;

public interface StudentService {
	
	 public List < Student > getStudent();

	 public void saveCustomer(Student student);

}
