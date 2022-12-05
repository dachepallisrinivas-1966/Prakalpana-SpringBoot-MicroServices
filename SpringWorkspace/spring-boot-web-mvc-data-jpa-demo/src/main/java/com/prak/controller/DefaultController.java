package com.prak.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {
	
	@ModelAttribute
	public void populateCommonData(Model model) {
		Map<String, String> navLinks = new LinkedHashMap<>();
		
		navLinks.put("home", "Home");
		navLinks.put("emps", "Employees");
		navLinks.put("newEmp", "New Employee");
		navLinks.put("searchEmp", "Search Employee");
		
		model.addAttribute("links", navLinks);
		model.addAttribute("appTitle", "Employee Record Manager");
	}
	
	@GetMapping({"","/","/home"})
	public ModelAndView showHomePageAction() {
		
		ModelAndView mv = new ModelAndView("dashBoardPage");
		
		return mv;
		
	}
	
	@GetMapping("/header")
	public ModelAndView showHeaderAction() {
		ModelAndView mv = new ModelAndView("headerSection");
		return mv;
	}
	
	@GetMapping("/footer")
	public ModelAndView showFooterAction() {
		ModelAndView mv = new ModelAndView("footerSection");
		return mv;
	}
}
