package com.lf.util.cache.helper;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface IAccessor {
	
	final String KEY_PLACE_RI="placeInterestRate";
	final String KEY_CITIES_LIST="citiesList";

	String getKey();
	Object getObject() throws FileNotFoundException, IOException;
	
}
