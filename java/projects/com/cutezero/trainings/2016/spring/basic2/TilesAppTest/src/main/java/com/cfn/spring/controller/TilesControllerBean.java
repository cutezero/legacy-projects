package com.cfn.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TilesControllerBean {

	@RequestMapping(value="welcome")
	public ModelAndView getWelcomePage(){
		return new ModelAndView("w"); 
	}
	
	@RequestMapping(value="friends")
	public ModelAndView getFriendsPage(){
		return new ModelAndView("f"); 
	}
	
	@RequestMapping(value="office")
	public ModelAndView getOfficePage(){
		return new ModelAndView("o"); 
	}
}
