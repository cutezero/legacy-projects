package com.cfn.helper;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public class RequestHelper {

	public static Object bind(HttpServletRequest request, Class ClassType) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException{
		Object object= null;
		Map<String, String[]> paramsMap= null;
		String setterName= null;
		
		paramsMap=request.getParameterMap();
		object= ClassType.newInstance();
		
		for(String param : paramsMap.keySet()){
			String paramName= param.replaceFirst(param.substring(0, 1), param.substring(0, 1).toUpperCase());
			setterName= "set"+paramName;
			Method method= object.getClass().getDeclaredMethod(setterName, String.class);
//			Method method= object.getClass().getDeclaredMethod(setterName, Serializable.class);
			method.invoke(object, paramsMap.get(param));
			System.out.println(" Method name : "+method.getName());
			
		}
		
		return object;
	}
}
