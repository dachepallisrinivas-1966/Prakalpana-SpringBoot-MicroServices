package com.prak.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prak.model.Employee;

public class App1 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Employee emp = context.getBean("emp", Employee.class);
		System.out.println(emp);
		
		((AbstractApplicationContext) context).close();
	}

}



							
							
							
		