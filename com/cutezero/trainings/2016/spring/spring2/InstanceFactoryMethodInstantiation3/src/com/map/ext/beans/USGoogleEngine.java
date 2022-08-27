package com.map.ext.beans;

import com.map.beans.IGoogleEngine;

public class USGoogleEngine implements IGoogleEngine{

	@Override
	public String[] getCoordinates(String source, String destination) {
		//logic to geet the coordinates from Google API
		return new String[]{"45.7594","45.767854","48.567","53.5757"};
	}

	
}
