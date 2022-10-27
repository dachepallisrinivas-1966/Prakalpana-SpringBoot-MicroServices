package com.prak.sbcd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GreetServiceMultiLingualImpl implements GreetService {

	// @Value("${greetings.array}")
	//private String[] greetings;

	@Value("#{${greetings.list}}")
	private List<String> greetings;
	
	@Override
	public String greet(String userName) {
		
		StringBuilder greeting = new StringBuilder();
		for(String greet : greetings) {
			greeting.append("\n" + greet + " " + userName);
		}
		return greeting.toString();
	}

}
