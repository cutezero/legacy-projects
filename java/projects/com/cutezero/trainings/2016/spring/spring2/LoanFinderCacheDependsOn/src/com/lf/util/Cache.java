package com.lf.util;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.lf.util.cache.helper.CacheManager;

public class Cache {

	private static Cache instance;
	private Map<String, Object> dataMap;
	private CacheManager cacheManager;
	
	private Cache() throws IOException{
		/**
		 * ConcurrentHashMap is Thread safe 
		 * It allows multiple threads to access the data inside a map
		 * It allows to lock only a single entry of data by one thread to protect the multithreading issue
		 * It gives the best performance in the application in a multi-threaded environment
		 */
		dataMap=new ConcurrentHashMap<String, Object>();
//		loadFromCacheManager();
		
	}
	
	public static synchronized Cache getInstance() throws IOException{
		if (instance==null){
			instance= new Cache();
		}
		return instance;
	}
	
	/**
	 * We don't need to make synchronized to the following 3 methods, 
	 * because we took CuncurrentHashMap which is by default Thread-safe
	 * 
	 * @param key ( it is the identifier for saving an object as value)
	 * @param value
	 */
	
	public void put (String key, Object value){
		dataMap.put(key, value);
	}
	
	/**
	 * following method inserts the map contents into the dataMap. 
	 * it doesn't insert the hashMap in to dataMap( contents of hashMap into dataMap)
	 * @param key
	 * @param hashMap
	 */
	public void putAll(Map<String, Object> hashMap){
		dataMap.putAll(hashMap);
	}
	
	public boolean containsKey(String key){
		return dataMap.containsKey(key);
	}
	
	public Object get(String key){
		return dataMap.get(key);
	}
	
/*	public void loadFromCacheManager() throws IOException{
		cacheManager=new CacheManager();
		putAll((Map<String, Object>)cacheManager.getObject());
	}*/
}
