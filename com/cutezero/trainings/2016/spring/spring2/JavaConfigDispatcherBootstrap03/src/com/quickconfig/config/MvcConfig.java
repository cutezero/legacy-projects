package com.quickconfig.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.ParameterizableViewController;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
public class MvcConfig {

//	@Bean(name="viewCareersController")
	@Bean(name="/careers.htm")
	public Controller careersViewController(){
		ParameterizableViewController viewController= null;
		viewController= new ParameterizableViewController();
		viewController.setViewName("careers");
		return viewController;
	}
	
	@Bean
	public ViewResolver internalResourceViewResolver(){
		InternalResourceViewResolver viewResolver= null;
		viewResolver= new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/jsp/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
}
