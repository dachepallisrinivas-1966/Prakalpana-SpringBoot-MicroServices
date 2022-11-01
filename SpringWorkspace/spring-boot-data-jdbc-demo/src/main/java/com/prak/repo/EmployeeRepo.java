package com.prak.repo;

import java.util.List;
import java.util.Optional;

import com.prak.model.Employee;

public interface EmployeeRepo {
	Employee save(Employee emp);
	void deleteById(Long empId);
	Optional<Employee> findById(Long empId);
	List<Employee> findAll();
}
