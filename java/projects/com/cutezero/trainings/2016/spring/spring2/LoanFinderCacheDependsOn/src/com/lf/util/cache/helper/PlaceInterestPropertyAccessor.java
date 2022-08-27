package com.lf.util.cache.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PlaceInterestPropertyAccessor implements IAccessor {

	@Override
	public String getKey() {
		return KEY_PLACE_RI;
	}

	@Override
	public Object getObject() throws FileNotFoundException, IOException {
		Properties properties= new Properties();
		properties.load(new FileInputStream(new File("G:\\SRIMAN_SpringWorkspace\\LoanFinder\\WebContent\\WEB-INF\\place-interest.properties")));
		return properties;
	}

}
