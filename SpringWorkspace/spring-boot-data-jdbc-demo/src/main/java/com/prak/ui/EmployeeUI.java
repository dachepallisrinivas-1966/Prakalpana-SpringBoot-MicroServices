package com.prak.ui;

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
		
	}
	
	
	
	

}
