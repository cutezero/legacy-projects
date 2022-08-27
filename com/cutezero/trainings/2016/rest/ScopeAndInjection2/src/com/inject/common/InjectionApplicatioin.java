package com.inject.common;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.inject.resources.LoanAgent;
import com.inject.resources.NetBanking;

@ApplicationPath("/resteasy")
public class InjectionApplicatioin extends Application{

	protected Set<Object> singletons;
	protected Set<Class<?>> classes;
	
	public InjectionApplicatioin() {
		singletons= new HashSet<>();
		classes= new HashSet<>();
		
		singletons.add(new NetBanking(4678587));
		classes.add(LoanAgent.class);
	}

	@Override
	public Set<Class<?>> getClasses() {
		// TODO Auto-generated method stub
		return classes;
	}
	
	@Override
	public Set<Object> getSingletons() {
		// TODO Auto-generated method stub
		return singletons;
	}

	

	
	
}
