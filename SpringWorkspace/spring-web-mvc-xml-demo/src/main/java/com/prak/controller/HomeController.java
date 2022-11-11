package com.prak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/")
public class HomeController {
	
	// @ResponseBody
	@RequestMapping(method = RequestMethod.GET)
	public String homeAction() {
		return "home";				// logical view name
	}
}
