package com.tourmanager.async.client.callback.handler;

import javax.ws.rs.client.InvocationCallback;
import javax.ws.rs.core.Response;

import com.tourmanager.dto.PackageInfo;

public class CallbackRequestHandler implements InvocationCallback<Response>{

	@Override
	public void completed(Response response) {
		System.out.println("Response Code : "+response.getStatus());
		if(response.getStatus()== 200) {
			response.bufferEntity();
			
			PackageInfo packageInfo= response.readEntity(PackageInfo.class);
			String info= response.readEntity(String.class);
			System.out.println("String Info : "+info);
			System.out.println("Package Name : "+packageInfo.getPackageName());
		}
	}

	@Override
	public void failed(Throwable e) {
		e.printStackTrace();
	}

}
