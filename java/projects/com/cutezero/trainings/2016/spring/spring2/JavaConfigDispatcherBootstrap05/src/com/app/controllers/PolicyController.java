package com.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PolicyController {

	@RequestMapping("/policy.action")
	public String viewPolicyPage(){
		return "policy";
	}
}
