package com.cpe.editors;

import java.beans.PropertyEditorSupport;

import com.cpe.beans.Dimension;

public class DimensionPropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String [] tokens=null;
		Dimension dimension= null;
		tokens=text.split(",");
		if(text==null || tokens.length!=3 ){
			throw new IllegalArgumentException("Invalid input for value field ");
		}
		dimension=new Dimension();
//		dimension=new Dimension("Hello");//this line works for single String param with constructor injection
//		dimension=new Dimension(Integer.parseInt(splits[0]));

		
		dimension.setLength(Integer.parseInt(tokens[0].trim()));
		dimension.setWidth(Integer.parseInt(tokens[1].trim()));
		dimension.setThickness(Integer.parseInt(tokens[2].trim()));
		setValue(dimension);
		
//		setValue(dimension);
	}

	
}
