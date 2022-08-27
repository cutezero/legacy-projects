package com.don.beans;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CitiesDbAccessor implements IAccessor {

	protected String key;
	private List<String> cities;
	
/*	public CitiesDbAccessor(String key) {
		super();
		this.key = key;
	}*/

	@Override
	public String getKey() {
//		return key;
		return IAccessor.KEY_CITY_LIST;	//It will be a constant to access all over the application
	}

	@Override
	public Object getData() throws IOException {
		cities=new ArrayList<String>();
		cities.add("Hyderabad");
		cities.add("Delhi");
		cities.add("Chennai");
		return cities;
	}

	
}
