package com.prak.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prak.model.Employee;

public class App1 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Employee emp = context.getBean("emp", Employee.class);
		System.out.println(emp);
		
		Employee emp3 = context.getBean("emp", Employee.class);
		System.out.println(emp3);
		
		emp.setSalary(51000.0);
		System.out.println(emp);
		System.out.println(emp3);
		
		
		
	}

}



							
							
							
		