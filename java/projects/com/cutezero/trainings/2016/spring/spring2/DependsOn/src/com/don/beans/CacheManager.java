package com.don.beans;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CacheManager {

	private Cache cache;
	private List<IAccessor> accessors;
	private Map<String, Object> hashMap;
	private String key;
	private Object data;
	

	public CacheManager(Cache cache, List<IAccessor> accessors) throws IOException {
		this.cache = cache;
		this.accessors=accessors;
		load();
	}

	public void load() throws IOException{
		hashMap=new HashMap<String, Object>();
		//The accessors List is being passed from Spring configuration file
		System.out.println("Accessors : "+accessors);
		
		for (IAccessor accessor: accessors){
			System.out.println("key1");
			key=accessor.getKey();
			data=accessor.getData();
			hashMap.put(key, data);
			System.out.println(key);
		}
		cache.putAll(hashMap);
	}
	
}
