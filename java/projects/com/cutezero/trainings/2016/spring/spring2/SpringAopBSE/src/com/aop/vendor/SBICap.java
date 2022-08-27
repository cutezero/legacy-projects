package com.aop.vendor;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.aop.provider.BSEStockTrade;

public class SBICap {

	public double findStockPrice(String stockName) {
		/**
		 * once we got the reference from JNDI we can call the method on that Object reference
		 * get the reference of BSE App from their JNDI registry by performing the lookup
		 * 
		 */
		
//		InitialContext context= InitialContext.doLookup("jndiName");
		//Howevere we are temporarily creating an object here right now
		BSEStockTrade bst= new BSEStockTrade();
		
		return bst.getStockPrice(stockName);
	}
}
