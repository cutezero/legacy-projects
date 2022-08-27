package com.thymeleaf.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.thymeleaf.dto.Account;

@Controller
public class AccountController {

	@RequestMapping("/accounts.htm")
	public String ListAccountsController(Model model){
		List<Account> accounts= null;
		
		System.out.println("Account -Controller is executing ");
		accounts= new ArrayList<Account>();
		accounts.add(new Account("1234123489", "Sriknata", 89.89, "Saving"));
		accounts.add(new Account("31588039801", "Bisu", 123.89, "Saving"));
		accounts.add(new Account("9787888567", "Lucky", 678.9, "Current"));
		
		model.addAttribute("accounts", accounts);
		return "accounts.html";
	}
}
