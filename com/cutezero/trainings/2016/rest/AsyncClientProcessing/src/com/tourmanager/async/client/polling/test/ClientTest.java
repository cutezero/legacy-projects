package com.tourmanager.async.client.polling.test;

import java.util.concurrent.ExecutionException;

import com.tourmanager.async.client.polling.TourManagerAsyncClient;
import com.tourmanager.dto.NewPackage;
import com.tourmanager.dto.PackageInfo;

public class ClientTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		TourManagerAsyncClient asyncClient= new TourManagerAsyncClient();
		NewPackage newPackage= new NewPackage();
		newPackage.setOrderId("ORD0989");
		newPackage.setPacakgeName("HAriyatra");
		newPackage.setAmount(2309.78f);
		newPackage.setComments("I want to update ");
		newPackage.setStatus("live");
		PackageInfo packageInfo= asyncClient.updatePackage(newPackage);
		System.out.println(" From MAin : "+packageInfo.getPackageName());
	}
}
