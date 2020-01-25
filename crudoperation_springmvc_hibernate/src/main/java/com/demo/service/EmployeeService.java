package com.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.entity.Employee;

@Service
public interface EmployeeService {
	
	 public List < Employee > getEmployee();

	    public void saveEmployee(Employee theEmployee);
	    public Employee getEmployee(int theId);

	    public void deleteEmployee(int theId);

	   
}
