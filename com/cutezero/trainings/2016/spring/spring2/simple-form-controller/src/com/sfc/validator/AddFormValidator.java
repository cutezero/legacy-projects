package com.sfc.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.sfc.dto.ProductDtoIn;

public class AddFormValidator implements Validator{

	@Override
	public boolean supports(Class<?> classType) {
		return (classType.isAssignableFrom(ProductDtoIn.class));
	}

	@Override
	public void validate(Object form, Errors errors) {
		ProductDtoIn product= (ProductDtoIn) form;
		
		if(product.getName().equals(null) || product.getName().length()==0){
			errors.rejectValue("name", "field.blank");
		}
		if(product.getCategory()==null || product.getCategory().length()==0){
			errors.rejectValue("category", "field.invalid");
		}
		
	}

	
}
