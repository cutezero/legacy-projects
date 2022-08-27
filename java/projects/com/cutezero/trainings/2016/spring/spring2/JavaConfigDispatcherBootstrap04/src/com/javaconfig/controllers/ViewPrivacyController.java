package com.javaconfig.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewPrivacyController {

	@RequestMapping("/privacy.mvc")
	public String viewPrivacyPage(){
		return "privacy";
	}
	
}
