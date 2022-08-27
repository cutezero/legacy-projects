package com.annotation.stereotype;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("hero")
@Lazy
//@Scope("prototype")
public class Bicycle {

	public Bicycle() {
		System.out.println("Bicycle()");
		System.out.println("Created");
	}
	
	public void ride(){
		System.out.println("Riding ");
	}
}
