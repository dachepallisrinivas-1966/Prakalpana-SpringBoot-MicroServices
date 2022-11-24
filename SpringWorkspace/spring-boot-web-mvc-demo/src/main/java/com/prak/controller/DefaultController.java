package com.prak.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {
	
	@Value("${app.title}")
	private String appTitle;
	
	@GetMapping("/")
	public String showHome() {
		return appTitle;
	}
	
	@GetMapping("/header")
	public String showHeader() {
		return "header";
	}
}
