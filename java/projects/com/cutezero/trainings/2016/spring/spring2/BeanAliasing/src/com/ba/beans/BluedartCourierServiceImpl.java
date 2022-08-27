package com.ba.beans;

import com.bluedart.beans.BluedartDeliveryService;

public class BluedartCourierServiceImpl implements ICourierService {

	@Override
	public String deliver(Order order, Address address) {
		return new BluedartDeliveryService().courier(address, order);
	}

}
