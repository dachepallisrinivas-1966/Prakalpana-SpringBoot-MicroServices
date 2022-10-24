package com.prak.service;

import org.springframework.stereotype.Service;

@Service
public class GreetServiceDefaultImpl implements GreetService {

	@Override
	public String greet(String userName) {
		return "Hello " + userName;
	}

}
