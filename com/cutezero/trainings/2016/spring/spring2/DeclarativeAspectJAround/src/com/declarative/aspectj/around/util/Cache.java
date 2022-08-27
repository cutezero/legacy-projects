package com.declarative.aspectj.around.util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Cache {

	private Map<String, Object> dataMap;
	private Cache(){
		//Singleton
		dataMap= new ConcurrentHashMap<>();
	}
	private static class CacheInner {
		private static final Cache instance= new Cache();
	}
	
	public synchronized static Cache getInstatnce(){
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
