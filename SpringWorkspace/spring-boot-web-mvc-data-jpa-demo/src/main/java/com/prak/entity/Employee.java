package com.prak.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name = "employees")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long empId;
	
	@NotEmpty(message = "firstName cannot be empty")
	@NotNull(message = "firstName cannot be omitted")
	private String firstName;
	
	@NotEmpty(message = "lastName cannot be empty")
	@NotNull(message = "lastName cannot be omitted")
	private String lastName;
	
	@Min(value=10000, message="basic salary can not less than 10000")
	@Max(value=20000, message="basic salary can not more than 20000")
	private Double basic;
	
	@DateTimeFormat(iso = ISO.DATE)	
	@PastOrPresent(message = "join date cannot be a future date")
	private LocalDate joinDate;
	
	@Enumerated(EnumType.STRING)
	private Department dept;
	
	@Pattern(regexp = "[1-9][0-9]{9}", message="mobile number is invalid")
	@NotNull(message = "mobile number cannot be omitted")
	private String mobileNumber;
	
	@Email(message="email is invalid")
	@NotNull(message = "email cannot be omitted")
	private String email;

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
