package com.bootstrap.common;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.bootstrap.resources.MessageReciever;
import com.bootstrap.resources.sub.MessageTranslator;

/*@ApplicationPath("bootstrap4")*/
public class JerseyBootstrapApplication extends Application{

	protected Set<Object> singletons;
	protected Set<Class<?>> classes;
	public JerseyBootstrapApplication() {
		System.out.println("JerseyBootstrapApplication() - Hashcode"+this.hashCode());
		singletons= new HashSet<>();
		classes= new HashSet<>();
		
		singletons.add(new MessageReciever());
		singletons.add(new MessageTranslator());
	}
	
	public Set<Object> getSingletons(){
		return singletons;
	}
	
	public Set<Class<?>> getClasses(){
		return classes;
	}
	
}
