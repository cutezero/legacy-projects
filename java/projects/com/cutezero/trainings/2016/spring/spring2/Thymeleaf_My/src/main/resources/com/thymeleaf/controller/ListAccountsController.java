package com.thymeleaf.controller;

@Controller
public class ListAccountsController {

	 @RequestMapping("/accounts.htm")
	    public String showAccounts(Model model) {
	        List<Account> accounts = null;

	        /* adding some dummy accounts to display in view */
	        accounts = new ArrayList<>();
	        accounts.add(new Account(1, "Susan", "savings"));
	        accounts.add(new Account(2, "Brain", "current"));

	        model.addAttribute("accounts", accounts);
	        return "accounts.html";
	    }
}
