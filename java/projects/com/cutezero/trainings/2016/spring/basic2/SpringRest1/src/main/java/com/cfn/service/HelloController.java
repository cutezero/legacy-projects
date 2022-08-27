package com.cfn.service;



import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(value="/hello/{username}", method=RequestMethod.GET, produces=MediaType.TEXT_HTML_VALUE)
	public String sayHello(@PathVariable("username")String uname){
		return "<h1>Hello..."+uname+"</h1>";
	}
}
