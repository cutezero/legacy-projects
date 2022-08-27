package com.cfn.spring.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView getLoginPage(){
		return new ModelAndView("login", "command", new User());
	}
	

	@RequestMapping(value="/check", method=RequestMethod.POST)
	public ModelAndView checkLogin(@Valid @ModelAttribute("command") User user, BindingResult br){
		if (br.hasErrors())
			return new ModelAndView("login");
		else
			return new ModelAndView("success");
	}
}
