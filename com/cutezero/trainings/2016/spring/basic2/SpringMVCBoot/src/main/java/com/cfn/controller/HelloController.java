package com.cfn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping(value="hi")
	public String sayHi(){
		return "hello";
	}
}
