package com.prak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.prak.model.Employee;
import com.prak.service.EmployeeService;

@Controller
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@ModelAttribute
	public void populateDesignations(Model model) {
		model.addAttribute("designations", new String[] {
				"Associate", "Jr.Associate","Sr.Associate","Manager","Architect"
		});
	}
	
	@GetMapping
	public ModelAndView showEmpInput() {
		return new ModelAndView("empInput", "emp", new Employee());
	}
	
	@PostMapping
	public ModelAndView showEmpOutput(@ModelAttribute("emp") Employee emp) {
		employeeService.computeAllowances(emp);
		return new ModelAndView("empOutput", "emp", emp);
	}
	
	
}
