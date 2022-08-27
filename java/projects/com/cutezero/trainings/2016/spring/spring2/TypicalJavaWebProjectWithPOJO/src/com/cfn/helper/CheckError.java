package com.cfn.helper;

import java.util.List;
import java.util.Map;

public class CheckError {

	/**
	 * This class is not complete and not usable 
	 * Please make sure you complete the logic before trying to put it on work
	 */
	private Map<String, List<String>> errors;
	private List<String> globalErrors;
	
	public boolean hasError(Object object){
		if(Validation.isValid(object))
			return false;
		return true;
	}
	
	public Map getErrors(){
		return null;
	}
}
