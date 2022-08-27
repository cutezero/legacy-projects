package org.edu.validator;

import org.edu.entities.User;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class UserValidator implements Validator{

	@Override
	public boolean supports(Class<?> classType) {
	
		return User.class.equals(classType);
	}

	@Override
	public void validate(Object obj, Errors errors) {
			
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "username.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "password.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstname", "firstname.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "email.required");
	}
}
