package com.app2.registrar;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.propertyeditors.CustomNumberEditor;

public class MyCustomBeanRegistrar implements PropertyEditorRegistrar{

	@Override
	public void registerCustomEditors(PropertyEditorRegistry registry) {
		NumberFormat numberFormat=new DecimalFormat("##,###.00");
		registry.registerCustomEditor(java.lang.Double.class, new CustomNumberEditor(java.lang.Double.class, true));
		
	}

	
}
