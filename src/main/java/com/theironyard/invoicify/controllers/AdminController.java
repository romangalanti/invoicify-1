package com.theironyard.invoicify.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@GetMapping("companies")
	public ModelAndView showCompanies() {
		ModelAndView mv = new ModelAndView("companies/list");
		return mv;
	}
	
	@PostMapping("companies")
		public ModelAndView createCompany() {
		ModelAndView mv = new ModelAndView("redirect:/admin/companies");
		return mv;
	}

}
