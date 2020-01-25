package com.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.EmployeeDao;
import com.demo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	@Transactional
	public List<Employee> getEmployee() {
		return employeeDao.getEmployee();
	}

	@Override
	@Transactional
	public void saveEmployee(Employee Employee) {
		employeeDao.saveEmployee(Employee);
	}

	@Override
	@Transactional
	public Employee getEmployee(int theId) {
		return employeeDao.getEmployee(theId);
	}

	@Override
	@Transactional
	public void deleteEmployee(int theId) {
		// TODO Auto-generated method stub
		employeeDao.deleteEmployee(theId);

	}

}
