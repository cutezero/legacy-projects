package com.map.ext.beans;

import com.map.beans.IGoogleEngine;

/**
 * This class assumed to be an external application class (Ex: EJB Application class)
 * This class is a distributed class 
 * It is an Implementation
 * @author Srikanta.ydon
 *
 */
public class IndiaGoogleEngine implements IGoogleEngine{

	@Override
	public String[] getCoordinates(String source, String destination) {
		//get the coordinates from google api
		return  new String[] {"12.798","13.648","12.374"};
		
	}

	
}
