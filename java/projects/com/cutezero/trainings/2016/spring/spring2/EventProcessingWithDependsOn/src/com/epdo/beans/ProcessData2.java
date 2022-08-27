package com.epdo.beans;

import java.util.List;
import java.util.Properties;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

import com.epdo.ep.events.AddEvent;
import com.epdo.ep.events.ReloadEvent;
import com.epdo.util.Cache;

public class ProcessData2 implements ApplicationContextAware{
	private Cache cache;
	private ApplicationContext context;
	private ApplicationEventPublisher publisher=null;
	
	public void getCity() {
//		System.out.println("City 2nd : " + ((List) cache.get("key_db")).get(1));
	}

	public ProcessData2(Cache cache) {
		super();
		this.cache = cache;
	}

	public void getState(String stateCode) {
		System.out.println("State name for "+stateCode+" : " + ((Properties)cache.get("key_properties")).getProperty(stateCode));
	}
	
	
	public void processMyEvent(){
		System.out.println("=======Event processing ============");
		
	}
	public void processAddEvent(String id, String name){
		System.out.println("=======Add Event processing ============");
		publisher=(ApplicationEventPublisher)context;
		AddEvent addEvent= new AddEvent(this, id, name);
		publisher.publishEvent(addEvent);
		
	}
	public void processReloadEvent(String name){
		System.out.println("=======Add Event processing ============");
		ReloadEvent reloadEvent=new ReloadEvent(this, name);
		publisher.publishEvent(reloadEvent);
		
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context=context;
	}

	
	
}
