package com.prak.service;

import java.util.List;

import com.prak.entity.Employee;

public interface EmployeeService {
	Employee save(Employee emp);
	
	Employee findById(Long empId);
	
	List<Employee> findAll();
}
