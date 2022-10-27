package com.prak.sbcd.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class GreetServiceTimeBasedImpl implements GreetService {

	@Override
	public String greet(String userName) {
		String greeting = "";
		int hours = LocalDateTime.now().getHour();
		if (hours >=3 && hours <= 11)
			greeting = "Good Morning";
		else if (hours > 11 && hours <= 16)
			greeting = "Good Afternoon";
		else if (hours > 16 && hours <= 19)
			greeting = "Good Evening";
		else 
			greeting = "Godd Night";
			
		return greeting + " " + userName;
	}

}
