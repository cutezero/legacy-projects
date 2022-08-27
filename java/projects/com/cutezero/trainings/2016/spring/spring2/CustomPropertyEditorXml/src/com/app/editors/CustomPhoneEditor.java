package com.app.editors;

import java.beans.PropertyEditorSupport;

import com.app.beans.Phone;
import com.app.beans.PhoneType;

public class CustomPhoneEditor extends PropertyEditorSupport{

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] tokens=null;
		tokens=text.split("|");
		if(tokens.length!=2)
			throw new IllegalArgumentException("Invalid format. Correct format is 'phoneType | 90909099' ");
		PhoneType phoneType=PhoneType.valueOf(tokens[0].trim().toUpperCase());
		Phone phone=new Phone();
		phone.setPhoneNumber(tokens[1].trim());
		phone.setPhoneType(phoneType);
		setValue(phone);
	}

	
}
