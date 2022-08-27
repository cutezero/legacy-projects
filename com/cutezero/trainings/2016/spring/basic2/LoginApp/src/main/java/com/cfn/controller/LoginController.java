package com.cfn.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cfn.pl.pojo.Login;

@Controller
public class LoginController {
	
	@RequestMapping(path="/login", method=RequestMethod.GET)
	public ModelAndView getLoginPage(){
		return new ModelAndView("login", "u", new Login());
	}
	
	@RequestMapping(path="/check", method=RequestMethod.POST)
	public ModelAndView checkLogin(@Valid @ModelAttribute("u") Login user, BindingResult br){
		if(br.hasErrors()){
			return new ModelAndView("login");
		}
		else{
			String uname=user.getUname();
			String pwd=user.getPwd();
			
			if(uname.equals("Sathya") && pwd.equals("tech")){
				return new ModelAndView("success","msg", "Login Success");
			}
			else{
				return new ModelAndView("failure", "msg", "Login Failure");
			}
		}
			
	}
}
