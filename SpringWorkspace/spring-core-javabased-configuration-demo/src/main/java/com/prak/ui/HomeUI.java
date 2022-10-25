package com.prak.ui;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.prak.service.GreetService;

@Component
public class HomeUI {
	
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
	
	public void run() {
		System.out.println(appTitle);
		System.out.println("---------------------------------------------------------");
		System.out.println("Enter user name: ");
		String userName = scan.nextLine();
		
		System.out.println(gs.greet(userName));
		System.out.println(gs2.greet(userName));
	}
}



