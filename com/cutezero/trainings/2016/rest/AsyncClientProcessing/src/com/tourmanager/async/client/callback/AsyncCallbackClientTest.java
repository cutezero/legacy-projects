package com.tourmanager.async.client.callback;

import com.tourmanager.dto.NewPackage;

public class AsyncCallbackClientTest {

	public static void main(String[] args) {
		TourManagerAsyncCallBackClient asyncCallBackClient= new TourManagerAsyncCallBackClient();
		NewPackage newPackage= new NewPackage();
		newPackage.setOrderId("ORD9078");
		newPackage.setPacakgeName("CHARDHAAM");
		newPackage.setAmount(3490.78f);
		newPackage.setComments("Shall I update it ?");
		newPackage.setStatus("PENDING");
		asyncCallBackClient.updatePackge(newPackage);
	}
}
