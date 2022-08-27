package com.annotation.configuration;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.annotation.Scope;
import org.springframework.context.expression.EnvironmentAccessor;
import org.springframework.core.env.Environment;

@Configuration
//@PropertySource("classpath:com/annotation/configuration/app_values.properties")
//@PropertySources({"classpath:com/annotation/configuration/app_values.properties", "classpath:com/annotation/configuration/app_values2.properties"})
@PropertySources(value={@PropertySource("classpath:com/annotation/configuration/app_values.properties"), @PropertySource("classpath:com/annotation/configuration/app_values2.properties")})
public class AppConfig {
	
	@Autowired
	Environment env;
	
//	@Bean(autowire=Autowire.BY_NAME)
	@Bean(autowire=Autowire.BY_TYPE)
//	@Scope("prototype")
//	@Lazy
	public Robot robot(){
		System.out.println("robot()");
		Robot robot=new Robot();
//		robot.setRobotId(Integer.parseInt(env.getProperty("ageGroup")));
		robot.setRobotId(Integer.parseInt(env.getProperty("id")));	//overrides the 1st key "id" to 2nd one 
//		return new Robot();
		return robot;
	}
	
	@Bean()
	public Chip chip2(){

		System.out.println("chip()");
		Chip chip= new Chip();
		chip.setChipNo(Integer.parseInt(env.getProperty("id")));
		System.out.println(chip);
		//'os' is the property which is set by the System environment Thats why we can't use it as a key in the properties file
		System.out.println("OS : "+env.getProperty("os"));	
		return chip;
		
		
		
		
//		return new Chip();
	}
}
