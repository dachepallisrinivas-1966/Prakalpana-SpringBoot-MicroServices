package com.prak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DefaultController {
	
	@GetMapping("/")
	@ResponseBody
	public String sayHello() {
		return "hello";
	}
}
