package com.prak.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prak.model.Employee;
import com.prak.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo empRepo;
	
	@Override
	public Employee save(Employee emp) {
		return empRepo.save(emp);
	}

	@Override
	public void deleteById(Long empId) {
		empRepo.deleteById(empId);

	}

	@Override
	public Optional<Employee> findById(Long empId) {
		return empRepo.findById(empId);
	}

	@Override
	public List<Employee> findAll() {
		return empRepo.findAll();
	}

}
