package com.annotation.dependson;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CacheManager {

	private Map<String, Object> cities=null;
	@Autowired
	private Cache cache;
	
	public CacheManager() {
		System.out.println("Creating CacheMnager... and loading the data to Cache...");
		load();
	}


	public void load(){
		cities=new HashMap<>();
		cities.put("BAM", 2900);
		cities.put("VSKP", 435);
		cities.put("SCB", 255);
		cities.put("BBS", 46);
		cities.put("MUM", 367);
		cities.put("HYD", 5430);
		cache=new Cache();
		cache.setDataMap(cities);
	}
	
}
