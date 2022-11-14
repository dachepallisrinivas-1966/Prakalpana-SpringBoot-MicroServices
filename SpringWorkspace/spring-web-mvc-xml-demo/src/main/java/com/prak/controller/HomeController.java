package com.prak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/")
public class HomeController {
	
	// @ResponseBody
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView showHome() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		
		mv.addObject("pageTitle", "Home Page - Welcome All");
		mv.addObject("developers", new String[] {"Vamsy", "Venkat", "Srinivas"} );
		
		return mv;
	}
	
	@RequestMapping("/header")
	public String showHeader() {
		return "header";
	}
	
	@RequestMapping("/footer")
	public String showFooter() {
		return "footer";
	}
}
