package com.prak.service;

import java.time.LocalTime;

import org.springframework.stereotype.Service;

@Service
public class GreetServiceImpl implements GreetService {

	@Override
	public String getGreeting() {
		String greeting = null;
		
		int hours = LocalTime.now().getHour();
		if (hours >= 4 && hours <= 12)
			greeting = "Good Morning";
		else if (hours > 12 && hours <= 16)
			greeting = "Godd Afternoon";
		else
			greeting = "Good Evening";
		
		return greeting;
	}

}
