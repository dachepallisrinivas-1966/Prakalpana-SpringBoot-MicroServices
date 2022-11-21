package com.prak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	@RequestMapping("/hello")
	public String sayHello(Model model) {
		model.addAttribute("message", "Hello world");
		return "hello";
	}
	
	@RequestMapping("/css")
	public String applyCSS() {
		return "add-css-demo";
	}
}
