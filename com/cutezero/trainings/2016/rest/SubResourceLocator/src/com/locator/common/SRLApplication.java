package com.locator.common;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.locator.resources.SamsungCare;

@ApplicationPath("/rest")
public class SRLApplication extends Application{

	private Set<Object> singletons;
//	private Set<Class<?>> classes;
	
	public SRLApplication() {
		singletons= new HashSet<>();
//		classes= new HashSet<>();
		
		singletons.add(new SamsungCare());
	}

/*	@Override
	public Set<Class<?>> getClasses() {
		// TODO Auto-generated method stub
		return classes;
	}
*/
	
/*	
	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
*/
	
}
