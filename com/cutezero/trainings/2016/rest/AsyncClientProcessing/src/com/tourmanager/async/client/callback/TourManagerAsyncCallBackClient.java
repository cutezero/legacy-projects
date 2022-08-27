package com.tourmanager.async.client.callback;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;

import com.tourmanager.async.client.callback.handler.CallbackRequestHandler;
import com.tourmanager.dto.NewPackage;

public class TourManagerAsyncCallBackClient {

	private final String TOUR_MANAGER_URI="http://localhost:8083/QuickTour/api/tour";

/*	private final String TOUR_MANAGER_URI2="http://localhost:8083/IbiboTour/api/tour";		//dummy one 
	private final String TOUR_MANAGER_URI3="http://localhost:8083/RedbusTour/api/tour";		//dummy one 
	private final String TOUR_MANAGER_URI4="http://localhost:8083/YatraTour/api/tour";		//dummy one 
*/	
	/**
	 * This Simple line makes the client API runs parallel request 
	 * same time without waiting for response of Web-resource
	 * @param newPackage
	 */
	public void updatePackge(NewPackage newPackage) {
		
		ClientBuilder.newClient().target(TOUR_MANAGER_URI).request().async().post(Entity.xml(newPackage), new CallbackRequestHandler());

		//like this we can send the request to multiple web-resources to handle them independently in separate threads
/*		ClientBuilder.newClient().target(TOUR_MANAGER_URI2).request().async().post(Entity.xml(newPackage), new CallbackRequestHandler());
		ClientBuilder.newClient().target(TOUR_MANAGER_URI3).request().async().post(Entity.xml(newPackage), new CallbackRequestHandler());
		ClientBuilder.newClient().target(TOUR_MANAGER_URI4).request().async().post(Entity.xml(newPackage), new CallbackRequestHandler());
*/	
	
	}
}
