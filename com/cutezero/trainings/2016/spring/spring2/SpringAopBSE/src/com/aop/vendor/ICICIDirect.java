package com.aop.vendor;

import java.util.Calendar;

import com.aop.provider.BSEStockTrade;
import com.aop.vendor.pojo.StockInfo;
import com.aop.vendor.util.Cache;

public class ICICIDirect {

//	StockInfo stockInfo = null;
	Cache cache = null;
	boolean isInCache = false;
	double stockprice = 0;

	/*
	 * lets try it with Cache
	 */
	public double findStockprice(String stockName) {
		// In WebApp get the stockName from jsp by
		// request.getParameter("stockname");
		cache = Cache.getInstance();
		if (cache.containsKey(stockName)) {
			StockInfo stockInfo = null;
			stockInfo = cache.get(stockName);
//			if((System.currentTimeMillis()-stockInfo.getLastAccessedTime())<=500)
//			if((Calendar.getInstance().getTime()-stockInfo.getLastAccessedTime().getTime())<=500)
//			if ((Calendar.getInstance().getTimeInMillis() - stockInfo.getLastAccessedTime().getTime()) <= 500) {
//			if (((System.currentTimeMillis()- stockInfo.getLastAccessTimeInMillis())>=1) && (System.currentTimeMillis()- stockInfo.getLastAccessTimeInMillis()) <= 500) {
			if ( (System.currentTimeMillis()- stockInfo.getLastAccessTimeInMillis()) <= 100) {
//			if ( (System.currentTimeMillis()- cache.get(stockName).getLastAccessTimeInMillis()) <= 100) {
				
				System.out.println(" Current time is: " +(System.currentTimeMillis()));
//				System.out.println(" LAT Time  is: " +(stockInfo.getLastAccessTimeInMillis()));
//				System.out.println(" difference is: " +(System.currentTimeMillis()-stockInfo.getLastAccessTimeInMillis()));
				
//			stockInfo = cache.get(stockName);
				stockprice = stockInfo.getStockPrice();
				System.out.println(" lat check condition : " + Calendar.getInstance().getTime());
				isInCache=true;
			}
			System.out.println("After Checking the hit : "+isInCache);
//			stockInfo=null;
		}
		if (isInCache == false) {
			// perform the lookup to JNDI with InitialContext
			System.out.println(" JNDI Lookup : " + Calendar.getInstance().getTime());
			BSEStockTrade bst = new BSEStockTrade();
			stockprice = bst.getStockPrice(stockName);
			StockInfo stockInfo = null;
			stockInfo = new StockInfo();
			stockInfo.setStockName(stockName);
			stockInfo.setStockPrice(stockprice);
//			stockInfo.setLastAccessedTime(Calendar.getInstance().getTime());
			stockInfo.setLastAccessTimeInMillis(System.currentTimeMillis());
			cache.put(stockName, stockInfo);
		}

		// perform JNDI Lookup and get the object from Provider app(Remote
		// application)
		return stockprice;
	}
}
