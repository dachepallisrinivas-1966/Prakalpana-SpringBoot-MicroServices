package com.prak.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prak.model.Visitor;

@Controller
public class VisitorController {
	
	@RequestMapping("/display-visitors")
	public String getVisitors(Model model) {
		List<Visitor> visitors = new ArrayList<>();
		visitors.add(new Visitor("srinivas", "6305730633"));
		visitors.add(new Visitor("vamsy", "6305730634"));
		visitors.add(new Visitor("kiran", "6305730635"));
		visitors.add(new Visitor("rajesh", "6305730636"));
		model.addAttribute("visitors", visitors);
		return "display-visitors";
		
	}
}
