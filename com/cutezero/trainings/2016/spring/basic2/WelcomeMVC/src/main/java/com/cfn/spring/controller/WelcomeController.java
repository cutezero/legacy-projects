package com.cfn.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	@RequestMapping(value="/test")
	public ModelAndView sayWelcome(){
		ModelAndView mav= new ModelAndView("welcome", "msg", "Now I think this is a ggoooodd message");
		return mav;
	}
}
