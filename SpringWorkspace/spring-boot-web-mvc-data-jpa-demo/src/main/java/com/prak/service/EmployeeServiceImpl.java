package com.prak.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prak.entity.Employee;
import com.prak.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Override
	public Employee save(Employee emp) {
		return employeeRepo.save(emp);
	}

	@Override
	public Employee findById(Long empId) {
		return employeeRepo.findById(empId).orElse(null);
	}

	@Override
	public List<Employee> findAll() {
		return employeeRepo.findAll();
	}

}
