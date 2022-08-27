package com.lf.util.cache.helper;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CitiesDbAccessor implements IAccessor {
	List<String> cities=null;

	@Override
	public String getKey() {
		return KEY_CITIES_LIST;
	}

	@Override
	public Object getObject() throws FileNotFoundException, IOException {
		cities=new ArrayList<String>();
		cities.add("city1");
		cities.add("city2");
		cities.add("city3");
		cities.add("city1");
		return cities;
	}

}
