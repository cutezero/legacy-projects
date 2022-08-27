package com.thymeleaf.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.thymeleaf.dto.Account;

@Controller
public class ListAccountsController {
    @RequestMapping("/accounts.htm")
    public String showAccounts(Model model) {
        List<Account> accounts = null;

        /* adding some dummy accounts to display in view */
        accounts = new ArrayList<Account>();
        accounts.add(new Account(1, "Susan", "savings"));
        accounts.add(new Account(2, "Brain", "current"));

        model.addAttribute("accounts", accounts);
        return "accounts.html";
    }
}