package com.prak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.prak.model.Loan;
import com.prak.service.LoanService;

@Controller
public class LoanController {
	@Autowired
	private LoanService loanService;
	
	@RequestMapping(value = "/loan", method = RequestMethod.GET)
	public String showLoanPage() {
		return "loanPage";
	}
	
	@RequestMapping(value = "/loan", method = RequestMethod.POST)
	public ModelAndView showLoanWithInterest(@ModelAttribute Loan loan) {
		loanService.computeInterest(loan);
		return new ModelAndView("loanPage", "loanModel", loan);
	}
}
