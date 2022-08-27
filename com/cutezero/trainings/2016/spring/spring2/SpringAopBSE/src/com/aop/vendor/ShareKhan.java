package com.aop.vendor;

import com.aop.provider.BSEStockTrade;
import com.aop.vendor.pojo.StockInfo;
import com.aop.vendor.util.Cache;

public class ShareKhan {

	private boolean isCacheEnabled=true;
	private double stockPrice=0;
	
	public double findStockPrice(String stockName){
	
		Cache cache=Cache.getInstance();
		boolean cacheHit= false;
		if(isCacheEnabled==true && cache.containsKey(stockName)){
			StockInfo stockInfo=cache.get(stockName);
			if((System.currentTimeMillis()-stockInfo.getLastAccessTimeInMillis())<=500){
				stockPrice= stockInfo.getStockPrice();
				cacheHit=true;
			}
			System.out.println("Cahe Hit :"+cacheHit);
		}
		if(isCacheEnabled==false || !cacheHit){
			//look up logic to get the distributed object
			BSEStockTrade bseStockTrade= new BSEStockTrade();
			stockPrice=bseStockTrade.getStockPrice(stockName);
			if(isCacheEnabled){
				StockInfo stockInfo= new StockInfo(stockName, stockPrice, System.currentTimeMillis());
				cache.put(stockName, stockInfo);
				System.out.println("Cahe Hit2 :"+cacheHit);
			}
		}
		return stockPrice;
	}
}
