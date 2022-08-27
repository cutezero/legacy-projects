package com.bluedart.beans;

import com.ba.beans.Address;
import com.ba.beans.Order;

public class BluedartDeliveryService {

	public String courier(Address address, Order order){
		return "Order delivered by Bluedart";
	}
	
	public static boolean checkBluedartCoverage(int zip){
		if (zip>=500030 && zip<=989009){
			return true;
		}else
			return false;
	}
}
