package com.app.provider;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.ext.ParamConverter;
import javax.ws.rs.ext.ParamConverterProvider;
import javax.ws.rs.ext.Provider;

import com.app.bean.AwbNo;
import com.app.paramconverters.AwbNoParamConverter;

@Provider
public class CustomParamConverterProvider implements ParamConverterProvider{

	
	
	@Override
	public <T> ParamConverter<T> getConverter(Class<T> clazz, Type enumOrClass, Annotation[] annotationsBinded) {
		ParamConverter<T> converter= null;
			if(clazz.isAssignableFrom(AwbNo.class))
				converter= (ParamConverter<T>) new AwbNoParamConverter();
			
		return converter;
	}
}
