package com.ba.beans;

import com.bluedart.beans.BluedartDeliveryService;

public class TransportManager {

	private ICourierService blueDartCourierService;
	private ICourierService dtdcCourierService;
	
/*	private Order order;
	private Address address;
	
	public void setOrder(Order order) {
		this.order = order;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
*/
	public String transport(Order order, Address address){
		if (BluedartDeliveryService.checkBluedartCoverage(address.getZip())){
			return blueDartCourierService.deliver(order, address);
		}else{
			return dtdcCourierService.deliver(order, address);
		}
	}

	public void setBlueDartCourierService(ICourierService blueDartCourierService) {
		this.blueDartCourierService = blueDartCourierService;
	}

	public void setDtdcCourierService(ICourierService dtdcCourierService) {
		this.dtdcCourierService = dtdcCourierService;
	}
	
}
