package com.cfn.beans.courier;

import com.cfn.model.Address;
import com.cfn.model.AmazonOrder;

public class BluedartCorier implements ICourier {

	public String ship(AmazonOrder order, Address address) {
		String trackingId="Bluedart_ID";
		return trackingId;
	}

}
