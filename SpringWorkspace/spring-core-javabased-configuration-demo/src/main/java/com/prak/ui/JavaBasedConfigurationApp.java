package com.prak.ui;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.prak.config.MyBeanConfig;

public class JavaBasedConfigurationApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyBeanConfig.class);
		LocalDate today = context.getBean("today", LocalDate.class);
		System.out.println(today);
		
		HomeUI homeUI = context.getBean("homeUI", HomeUI.class);
		homeUI.run();
		
		
		((AbstractApplicationContext) context).close();
	}

}

