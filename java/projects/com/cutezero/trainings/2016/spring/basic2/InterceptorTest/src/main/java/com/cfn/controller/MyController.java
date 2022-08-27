package com.cfn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	
	@RequestMapping( value="/home")
	public ModelAndView getMessage(){
		System.out.println("get Mesage......()......");
		try{
			Thread.sleep(10000);
		}
		catch (Exception e) {
			
		}
		return new ModelAndView("home");
	}
}
