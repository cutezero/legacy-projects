package com.epdo.helper;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.epdo.accessors.IAccessor;
import com.epdo.util.Cache;

public class CacheManager {

	private Cache cache;
	private Map<String, Object> hashMap;
	
	private List<IAccessor> accessors;
	
	public CacheManager(List<IAccessor> accessors) throws IOException{
		this.accessors=accessors;
		cache= Cache.getInstance();
		load();
	}
	public void load() throws IOException{
		hashMap=new HashMap<>();
		for (IAccessor accessor : accessors)
			hashMap.put(accessor.getKey(), accessor.getData());
		cache.putAll(hashMap);
	}
	public void reload() throws IOException {
		load();
	}
	
}
