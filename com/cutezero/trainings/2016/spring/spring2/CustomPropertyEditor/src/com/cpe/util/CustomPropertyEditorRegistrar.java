package com.cpe.util;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

import com.cpe.beans.Dimension;
import com.cpe.editors.DimensionPropertyEditor;

public class CustomPropertyEditorRegistrar implements PropertyEditorRegistrar{

	@Override
	public void registerCustomEditors(PropertyEditorRegistry registry) {
		registry.registerCustomEditor(Dimension.class, new DimensionPropertyEditor());
	}

	
}
