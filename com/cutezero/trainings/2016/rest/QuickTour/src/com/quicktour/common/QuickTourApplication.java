package com.quicktour.common;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.quicktour.resources.TourManager;

@ApplicationPath("/api")
public class QuickTourApplication extends Application{

	public Set<Object> singletons;
	
	public QuickTourApplication() {
		super();
		singletons= new HashSet<>();
		singletons.add(new TourManager());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}

	
}
