package com.annotation.propertysource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:com/annotation/propertysource/toy.properties")
public class Toy {

	@Value("${name}")
	private String toyName;
	@Value("${age}")
	private int ageGroup;
	
	
	@Override
	public String toString() {
		return "Toy [toyName=" + toyName + ", ageGroup=" + ageGroup + "]";
	}
	
	
}
