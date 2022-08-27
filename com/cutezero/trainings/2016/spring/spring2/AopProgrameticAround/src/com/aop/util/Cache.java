package com.aop.util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Cache {

	private Map<String, Object> dataMap;
	private Cache(){
	
		dataMap= new ConcurrentHashMap<String, Object>();
	}
	
	private static class CacheHelper{
		private static final Cache instance= new Cache();
	}
	
	public static Cache getInstance(){
		return CacheHelper.instance;
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
