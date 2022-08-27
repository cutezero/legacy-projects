package com.acc.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.acc.dto.MobileDto;

public class MobileValidator implements Validator{

	@Override
	public boolean supports(Class<?> classType) {

		return classType.isAssignableFrom(MobileDto.class);
	}

	//It will automatic fatch the error msg from properties file.
	
	@Override
	public void validate(Object obj, Errors err) {

		MobileDto dto=(MobileDto)obj;
		if(dto.getBrand() == "")
		{
			err.rejectValue("brand", "err.brand"); //err.brand is the key of properties file
		}
		if(dto.getMinPrice()==0)
		{
			err.rejectValue("minPrice", "err.minPrice");
		}
		if(dto.getMaxPrice()==0)
		{
			err.rejectValue("maxPrice", "err.maxPrice");
		}
	}

}
