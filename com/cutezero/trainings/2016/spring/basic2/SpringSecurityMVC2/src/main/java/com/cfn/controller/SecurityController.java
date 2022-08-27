package com.cfn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecurityController {

	@RequestMapping("welcome")
	public ModelAndView getWelcomePage(){
		return new ModelAndView("welcome");
	}
	
	@RequestMapping("/admin")
	public ModelAndView getAdminPage(){
		return new ModelAndView("admin");
	}
}
