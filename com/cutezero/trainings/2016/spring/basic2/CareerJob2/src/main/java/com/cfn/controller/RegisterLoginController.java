package com.cfn.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cfn.models.RegisterPerson;

@Controller
public class RegisterLoginController {
	
	protected String responseMessage= "No Action performed";
	
	@RequestMapping("candidate_register")
	public ModelAndView getCandidateRegisterPage(){
		responseMessage="Clicked Candidate Register";
		return new ModelAndView("candidateRegister", "responseMessage", responseMessage);
	}
	
	@RequestMapping("recruiter_register")
	public ModelAndView getRecruiterRegisterPage(){
		responseMessage="Clicked Recruiter Register";
		return new ModelAndView("recruiterRegister", "responseMessage", responseMessage);
	}
	
	@RequestMapping("candidate_login")
	public ModelAndView getCandidateLoginPage(){
		responseMessage="Clicked Candidate login";
		return new ModelAndView("candidateLogin", "responseMessage", responseMessage);
	}
	
	@RequestMapping("recruiter_login")
	public ModelAndView getRecruiterLoginPage(){
		responseMessage="Clicked Recruiter Login";
		return new ModelAndView("recruiterLogin", "responseMessage", responseMessage);
	}
	
//Copied from RgisterMVC	
	/*@InitBinder
	public void initBinder(WebDataBinder binder){
		CustomDateEditor editor=new CustomDateEditor(new SimpleDateFormat("MM/dd/yyyy"),true);
		binder.registerCustomEditor(Date.class, editor);
	}
	
	@RequestMapping(value="candidate_register", method=RequestMethod.GET)
	public ModelAndView getRegisterPage(){
		//RegisterPerson registerObj=new RegisterPerson();
		return new ModelAndView("candidateRegister","candidateRegister", new RegisterPerson());
	}
	
	@RequestMapping(value="registerUser", method=RequestMethod.POST)
	public ModelAndView registerUser(@Valid @ModelAttribute("reg") RegisterPerson user, BindingResult br){
		if(br.hasErrors()){
			return new ModelAndView("candidateRegister");
		}
		else{
				return new ModelAndView("candidateRegister", "responseMessage", responseMessage); 
		}
	}	
*/}
