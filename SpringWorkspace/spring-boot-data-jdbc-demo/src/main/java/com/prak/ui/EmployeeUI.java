package com.prak.ui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.prak.model.Employee;
import com.prak.service.EmployeeService;

@Component
public class EmployeeUI implements ApplicationRunner {
	
	@Autowired
	private EmployeeService empService;
	
	@Autowired
	private Scanner kbin;
	
	@Autowired
	private DateTimeFormatter dtf;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Menu menu = null;
		Menu[] menus = Menu.values();
		
		while(menu != Menu.QUIT) {
			Arrays.stream(menus).map(m -> m.ordinal() + "\t" + m).forEach(System.out::println);
			System.out.println("Choice: ");
			int ch = kbin.nextInt();
			
			if (ch < 0 || ch >= menus.length) {
				System.out.println("invalid choice");
				continue;
			}
			
			menu = menus[ch];
			switch (menu) {
			case LIST: doList();
						break;
			case ADD: doAdd();
						break;
			case REMOVE: doRemove();
						break;
			case QUIT: System.out.println("App Terminated");
						break;
			
			}
		}
		
	}
	
	private void doList() {
		List<Employee> emps = empService.findAll();
		
		if (emps.isEmpty()) {
			System.out.println("No Employees Foun");
		} else {
			emps.stream().forEach(System.out::println);
		}
	}
	
	
	private void doAdd() {
		Employee emp = new Employee();
		System.out.println("Enter Name: ");
		emp.setFullName(kbin.next());
		System.out.println("Enter Basic Pay: ");
		emp.setBasic(kbin.nextDouble());
		System.out.println("Enter Join Date (dd-MM-yy): ");
		emp.setJoinDate(LocalDate.parse(kbin.next(), dtf));
		
		emp = empService.save(emp);
		System.out.println("Employee added");
	}
	
	private void doRemove() {
		System.out.println("EmpId: ");
		long empId = kbin.nextLong();
		empService.deleteById(empId);
		System.out.println("Employee deleted");
	}
	
	
	

}
