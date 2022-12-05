package com.prak.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prak.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
	
}
