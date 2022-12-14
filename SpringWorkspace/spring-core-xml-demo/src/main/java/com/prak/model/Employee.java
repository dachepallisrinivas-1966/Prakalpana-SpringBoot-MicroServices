package com.prak.model;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private int empId;
	private String name;
	private double salary;
	private String[] hobbies;
	private List<String> skills;
	private Set<String> qualifications;
	private Map<String, String> contacts;
	
	
	private Account salaryAccount;
	

	public Employee() {
		/* default constructor */
	}

	public Employee(int empId, String name, double salary, String[] hobbies) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.hobbies = hobbies;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public Set<String> getQualifications() {
		return qualifications;
	}

	public void setQualifications(Set<String> qualifications) {
		this.qualifications = qualifications;
	}

	public Map<String, String> getContacts() {
		return contacts;
	}

	public void setContacts(Map<String, String> contacts) {
		this.contacts = contacts;
	}

	public Account getSalaryAccount() {
		return salaryAccount;
	}

	public void setSalaryAccount(Account salaryAccount) {
		this.salaryAccount = salaryAccount;
	}

	@Override
	public String toString() {
		return String.format(
				"Employee [empId=%s, name=%s, salary=%s, hobbies=%s, skills=%s, qualifications=%s, contacts=%s, salaryAccount=%s]",
				empId, name, salary, Arrays.toString(hobbies), skills, qualifications, contacts, salaryAccount);
	}

}
