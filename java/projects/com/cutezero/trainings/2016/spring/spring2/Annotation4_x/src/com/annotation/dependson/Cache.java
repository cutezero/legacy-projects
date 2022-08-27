package com.annotation.dependson;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class Cache {

	private Map<String, Object> dataMap;

	
	
	public Cache() {

		dataMap= new HashMap<>();
		dataMap=new HashMap<>();
		dataMap.put("BAM", 2900);
		dataMap.put("VSKP", 435);
		dataMap.put("SCB", 255);
		dataMap.put("BBS", 46);
		dataMap.put("MUM", 367);
		dataMap.put("HYD", 5430);
	}

	public Map<String, Object> getDataMap() {
		return dataMap;
	}

	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}
	
	public Object get(String key){
		return dataMap.get(key);
	}
	
}
