package com.prak.model;

import java.time.LocalDate;

public class Employee {
	private Long empId;
	private String fullName;
	private Double basic;
	private LocalDate joinDate;
	
	public Employee() {
		/* default constructor */
	}

	public Employee(Long empId, String fullName, Double basic, LocalDate joinDate) {
		this.empId = empId;
		this.fullName = fullName;
		this.basic = basic;
		this.joinDate = joinDate;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Double getBasic() {
		return basic;
	}

	public void setBasic(Double basic) {
		this.basic = basic;
	}

	public LocalDate getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}

	@Override
	public String toString() {
		return String.format("empId=%s, fullName=%s, basic=%s, joinDate=%s", empId, fullName, basic,
				joinDate);
	}
	
	
	
}
