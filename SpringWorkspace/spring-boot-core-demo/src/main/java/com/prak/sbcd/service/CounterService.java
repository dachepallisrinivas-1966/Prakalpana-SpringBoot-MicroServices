package com.prak.sbcd.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class CounterService {
	private int seed;
	
	public int next() {
		return ++seed;
	}
}
