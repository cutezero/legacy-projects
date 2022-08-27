package com.map.helper;

import com.map.beans.IGoogleEngine;
import com.map.ext.beans.IndiaGoogleEngine;
import com.map.ext.beans.USGoogleEngine;

public class MapEngineServiceLocator {

	public IGoogleEngine locateGoogleEngine(String geoLocation){
		if(geoLocation.equals("India")){
			return new IndiaGoogleEngine();
		}
		else if(geoLocation.equals("US")){
			return new USGoogleEngine();
		}
		else
			return null;
	}
}
