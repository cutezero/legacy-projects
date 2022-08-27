package com.ifmi.beans;

import com.ifmi.helper.StockTradeServiceLocator;

public class ICICIStockFinder {

	private IStockTrade stockTrade;

	public void setStockTrade(IStockTrade stockTrade) {
		this.stockTrade = stockTrade;
	}
	
	public double getStockPrice(String stockName){
		
		//lookup logic 
		StockTradeServiceLocator locator=new StockTradeServiceLocator();
		IStockTrade stockTrade=locator.getStockTrade();
		return stockTrade.getStockPrice(stockName);
	}
}
