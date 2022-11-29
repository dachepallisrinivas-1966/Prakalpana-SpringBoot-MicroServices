package com.prak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.prak.service.ArithmeticService;

@Controller
public class ArithmeticController {
	
	@Autowired
	private ArithmeticService arithService;
	
	@GetMapping("/arith")
	public String showArithmeticInputPage() {
		return "arithInput";
	}
	
}
