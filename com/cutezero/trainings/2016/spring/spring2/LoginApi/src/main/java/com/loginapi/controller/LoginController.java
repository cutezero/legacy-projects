package com.loginapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.loginapi.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	LoginService service;
	@RequestMapping(value="/login")
	public String login(){
		service.getLoginDetails();
		return "devicedetails";
	}

}
