package com.prak.ui;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.prak.service.GreetService;

@Component
public class HomeUI {
	@Autowired
	private Scanner scan;
	
	@Autowired
	private GreetService gs;
	
	public void run() {
		System.out.println("Enter user name: ");
		String userName = scan.nextLine();
		
		System.out.println(gs.greet(userName));
	}
}



