package com.app.utils;

import java.util.HashMap;
import java.util.Map;

public class Cache {

	private  static Cache instance;
	
	private Map<String, Object> dataMap;
	
	private Cache(){
		dataMap=new HashMap<String, Object>();
	}
	
	public synchronized void put(String key, Object value){
		dataMap.put(key, value);
	}
	public synchronized Object get(String key){
		return dataMap.get(key);
	}
	public synchronized boolean containskey(String key){
		return dataMap.containsKey(key);
	}
	
	public static synchronized Cache getInstance(){
		if (instance==null){
			instance=new Cache();
		}
		return instance;
	}
}
