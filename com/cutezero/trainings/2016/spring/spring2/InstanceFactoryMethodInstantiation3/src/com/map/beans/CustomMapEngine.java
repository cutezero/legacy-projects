package com.map.beans;

/**
 * This class helps to get an object of distributed 
 * class of another application(Ex: EJB Application)
 * @author Srikanta.ydon
 *
 */
public class CustomMapEngine {

	private IGoogleEngine googleEngine;

	public void setGoogleEngine(IGoogleEngine googleEngine) {
		this.googleEngine = googleEngine;
	}
	
	public void render(String source, String destination){
		String[] geoCoordinates=googleEngine.getCoordinates(source, destination);
		for(String geoCode:geoCoordinates){
			System.out.println(geoCode);
		}
	}
}
