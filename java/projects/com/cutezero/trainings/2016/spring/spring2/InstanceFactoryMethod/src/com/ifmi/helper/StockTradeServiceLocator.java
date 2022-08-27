package com.ifmi.helper;

import com.ifmi.beans.IStockTrade;
import com.ifmi.ext.beans.BSEStockTrade;

public class StockTradeServiceLocator {

	public IStockTrade getStockTrade() {
		// lookup logic
		/*
		 * Hashtable< String, Object> hashtable=new Hashtable<>();
		 * InitialContext context= new InitialContext(hashtable, factory, "url",
		 * "username", "password");
		 */
		IStockTrade stockTrade = new BSEStockTrade();
		return stockTrade;
	}
}
