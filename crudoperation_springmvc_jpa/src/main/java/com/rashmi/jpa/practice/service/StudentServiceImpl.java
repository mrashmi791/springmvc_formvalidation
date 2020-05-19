package com.rashmi.jpa.practice.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rashmi.jpa.practice.entity.Student;
import com.rashmi.jpa.practice.repositary.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentrepository;

	@Override
	@Transactional
	public List<Student> getStudent() {
		return studentrepository.findAll();
	}

	@Override
	@Transactional
	public void saveCustomer(Student student) {
		studentrepository.save(student);
		
	}

}
