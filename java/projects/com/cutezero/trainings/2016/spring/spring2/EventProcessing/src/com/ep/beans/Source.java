package com.ep.beans;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.MapUtils;
import org.eclipse.core.internal.preferences.ImmutableMap;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class Source implements ApplicationEventPublisherAware{

	private ApplicationEventPublisher publisher;
	private List<String> citiesList;
//	private Map<String, String> citiesMap;
	private String tableName;
	
	public void updateCity(int cityID, String cityName){
		citiesList=Arrays.asList("HYD", "BBSR", "BAM", "VSKP");
		
		String className=citiesList.getClass().getName();
		System.out.println("ClassName : "+className);
//		citiesList.add(cityName);
		for (String city: citiesList)
			System.out.println("City : "+city);
		System.out.println("City : "+cityName+ " has been added to the List");
		System.out.println("Forwarding the request to reloading the cache ");
		tableName="citiesList";
		ReloadEvent event=new ReloadEvent(this, tableName);
		publisher.publishEvent(event);
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher=publisher;
	}
	
}
