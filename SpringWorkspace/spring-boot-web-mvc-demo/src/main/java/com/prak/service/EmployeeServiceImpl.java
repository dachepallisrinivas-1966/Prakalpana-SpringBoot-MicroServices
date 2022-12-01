package com.prak.service;

import org.springframework.stereotype.Service;

import com.prak.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public void computeAllowances(Employee emp) {
		emp.setHra(emp.getBasic()*0.25);
		emp.setTa(emp.getBasic()*0.11);

	}

}
