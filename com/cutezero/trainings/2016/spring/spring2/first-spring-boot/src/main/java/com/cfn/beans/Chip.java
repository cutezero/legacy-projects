package com.cfn.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Chip {

	@Value("${chipNo}")
	private int chipNo;
	public int chipDetails(){
		return chipNo;
	}
}
