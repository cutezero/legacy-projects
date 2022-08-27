package com.ifmi.ext.beans;

import com.ifmi.beans.IStockTrade;

public class BSEStockTrade implements IStockTrade{

	@Override
	public double getStockPrice(String stockName) {
		// Get data from DB
		if (stockName=="cipla")
			return 657.9887;	
		else if (stockName=="jio")
			return 46743.754;
		else
			return 7854.8745;
	}

	
}
