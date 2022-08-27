package com.map.helper;

import com.map.beans.IGoogleEngine;
import com.map.ext.beans.IndiaGoogleEngine;
import com.map.ext.beans.USGoogleEngine;

public class MapEngineServiceLocator {

	public IGoogleEngine locateIndiaGoogleEngine(){
		return new IndiaGoogleEngine();
	}
	
	public IGoogleEngine locateUSGoogleEngine(){
		return new USGoogleEngine();
	}
}
