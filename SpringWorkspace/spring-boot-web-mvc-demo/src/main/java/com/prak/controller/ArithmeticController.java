package com.prak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.prak.model.ArithmeticModel;
import com.prak.service.ArithmeticService;

@Controller
public class ArithmeticController {
	
	@Autowired
	private ArithmeticService arithService;
	
	@GetMapping("/arith")
	public String showArithmeticInputPage() {
		return "arithInput";
	}
	
	@PostMapping("/arith")
	public ModelAndView showArithmeticOutputPage(@ModelAttribute ArithmeticModel arithModel) {
		arithService.computeResults(arithModel);
		return new ModelAndView("arithOutput", "arith", arithModel);
	}
	
}
