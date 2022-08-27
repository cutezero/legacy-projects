package com.aop.vendor.util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.aop.vendor.pojo.StockInfo;

public class Cache {

	private static Cache instance;
	private Map<String, StockInfo> stockInfoMap;
	private Cache(){
		stockInfoMap = new ConcurrentHashMap<String, StockInfo>();
		System.out.println("Cache()");
	}
	public static synchronized Cache getInstance(){
		if (instance==null)
			instance= new Cache();
		System.out.println("getInstance()");
		return instance;
	}
	
	public StockInfo get(String stockName){
		System.out.println("get(stockName)");
		return stockInfoMap.get(stockName);
	}
	public void put(String stockName, StockInfo stockInfo){
		System.out.println("put(stockName, obj)");
		stockInfoMap.put(stockName, stockInfo);
	}
	public boolean containsKey(String stockName){
		System.out.println("contains(stockName)");
		return stockInfoMap.containsKey(stockName);
	}
}
