package com.locator.common;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

import com.locator.resources.SamsungCare;

//@ApplicationPath("/jersey")	//disabled on-behalf of SRLApplication config class
public class JerseySpecificApplication extends ResourceConfig{

	public JerseySpecificApplication() {
		//singleton
		register(new SamsungCare());
		
		//Request scope
//		register(SamsungCare.class);
	}

	
}
