package com.sb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sb.dao.ContactBo;
import com.sb.service.ContactService;

@Controller
public class ContactController {

	@Autowired 
	private ContactService contactService;
	
	@RequestMapping("/get-contacts")
	public String getContactbyMobile(Model model){
		List<ContactBo> contact= contactService.getContactByMobileNo();
		model.addAttribute("contact", contact.get(0));
		
		return "contacts";
	}
}