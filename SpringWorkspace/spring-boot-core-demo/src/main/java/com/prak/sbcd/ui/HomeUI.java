package com.prak.sbcd.ui;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.prak.sbcd.service.CounterService;
import com.prak.sbcd.service.GreetService;

@Component
public class HomeUI implements CommandLineRunner {
	
	@Value("${app.title:Spring First Application}")
	private String appTitle;
	
	@Autowired
	private Scanner scan;
	
	@Autowired
	@Qualifier("greetServiceTimeBasedImpl")
	private GreetService gs;
	
	@Autowired
	@Qualifier("greetServiceDefaultImpl")
	private GreetService gs2;
	
	@Autowired
	@Qualifier("greetServiceMultiLingualImpl")
	private GreetService gs3;
	
	@Autowired
	private CounterService c1;
	
	@Autowired
	private CounterService c2;
	
	@Autowired
	private CounterService c3;
	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(appTitle);
		System.out.println("---------------------------------------------------------");
		System.out.println("Enter user name: ");
		String userName = scan.nextLine();
		System.out.println(gs.greet(userName));
		System.out.println(gs2.greet(userName));
		System.out.println(gs3.greet(userName));
		
		System.out.println("Counter From c1 = " + c1.next());
		System.out.println("Counter From c2 = " + c2.next());
		System.out.println("Counter From c3 = " + c3.next());
	}
}



