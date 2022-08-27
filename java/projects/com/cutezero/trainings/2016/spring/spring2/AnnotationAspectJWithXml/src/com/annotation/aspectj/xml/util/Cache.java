package com.annotation.aspectj.xml.util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Component;

@Component
public class Cache {

	private Map<String, Object> dataMap;
	private static Cache instance;
	private Cache(){
		dataMap= new ConcurrentHashMap<>();
				
	}
	
	public static synchronized Cache getInstatnce(){
		if(instance==null)
			instance= new Cache();
		return instance;
	}
	public void put(String key, Object value){
		dataMap.put(key, value);
	}
	public Object get(String key){
		return dataMap.get(key);
	}
	public boolean containsKey(String key){
		return dataMap.containsKey(key);
	}
}
