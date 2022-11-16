package com.prak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.prak.service.GreetService;

@Controller
public class GreetController {
	
	@Autowired
	private GreetService greetService;
	
	@RequestMapping(value = "/greet", method = RequestMethod.GET)
	public ModelAndView showGreetPage(@RequestParam(name = "userName", required=false) String userName) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("greet");
		if (userName != null) {
			mv.addObject("greeting", greetService.getGreeting() + " " + userName);
		}
		return mv;
	}
	

}
