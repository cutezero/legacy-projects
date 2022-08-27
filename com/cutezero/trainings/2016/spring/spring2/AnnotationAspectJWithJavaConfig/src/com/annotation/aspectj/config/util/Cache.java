package com.annotation.aspectj.config.util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Component;

@Component
public class Cache {

	private Map<String, Object> dataMap;
	private Cache(){
		dataMap= new ConcurrentHashMap<>();
	}
	private static class CacheInner{
		private static final Cache instance= new Cache();
	}
	public synchronized static Cache getInstance(){
		return CacheInner.instance;
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
