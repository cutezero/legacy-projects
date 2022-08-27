package com.don.beans;

import java.io.IOException;
import java.util.Properties;

public class PlaceInterestPropsAccessor implements IAccessor {

	protected String key;
	Properties properties=null;
	
	
	/*public PlaceInterestPropsAccessor(String key) {
		this.key = key;
	}*/

	@Override
	public String getKey() {
//		return key;
		return IAccessor.KEY_PLACE_IR;
	}

	@Override
	public Object getData() throws IOException {
		properties=new Properties();
		System.out.println("accessing the properties file");
		properties.load(this.getClass().getClassLoader().getResourceAsStream("com/don/common/place-interest.properties"));
		System.out.println("properties file has been loaded ");
		return properties;
	}

}
