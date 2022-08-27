package com.cfn.helper;


public class Validation {

	public static boolean isValid(Object object){
		System.out.println(object.getClass().getName());
		switch (object.getClass().getName()) {
		case "String":
			String str= null;
			str=(String) object;
			if(str.equals(null) || str.length()<=0)
				return false;
			return true;
//			break;
		case "Integer":
			Integer intValue= null;
			intValue=(Integer) object;
			if(intValue.equals(null) || intValue<=0)
				return false;
			return true;
//			break;
		case "int":
			int number= 0;
			number=(int) object;
			if(number<=0)
				return false;
			return true;
//			break;
			
		default:
			return false;
//			break;
		}
	}
}
