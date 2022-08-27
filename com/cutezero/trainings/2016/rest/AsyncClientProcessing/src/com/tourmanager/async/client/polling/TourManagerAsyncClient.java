package com.tourmanager.async.client.polling;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import javax.ws.rs.client.AsyncInvoker;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.core.Response;

import com.tourmanager.dto.NewPackage;
import com.tourmanager.dto.PackageInfo;

public class TourManagerAsyncClient {
	//Polling mechanism
	private final String TOUR_MANAGER_URI="http://localhost:8083/QuickTour/api/tour";
	public PackageInfo updatePackage(NewPackage newPackage) throws InterruptedException, ExecutionException {
		Future<Response> future= null;
		Builder builder=null;
		AsyncInvoker asyncInvoker= null;
		PackageInfo packageInfo= null;
		
		builder=ClientBuilder.newClient().target(TOUR_MANAGER_URI).request();
		asyncInvoker=builder.async();
		future= asyncInvoker.post(Entity.xml(newPackage));
		
		//do something 
		System.out.println(" 10 lines of code executed ");
		System.out.println("Now I need response object to process further");
		
		//Block the 'control' until future has got the response (which is expected) 
		while(future.isDone());
		
		Response response= null;
		response= future.get();		//it will get the expected output from the Future object
		
		System.out.println(" Response code : "+ response.getStatus());
		if(response.getStatus()==200) {
			response.bufferEntity();
			packageInfo=response.readEntity(PackageInfo.class);
			String Info= response.readEntity(String.class);
			System.out.println("String : "+Info);
		}
		
		return packageInfo;
	}
}
