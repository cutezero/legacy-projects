package com.client.test;

import com.client.invoker.MerchantInvoker;

public class ClientTest {

	public static void main(String[] args) {

		MerchantInvoker invoker= null;
		String responseString= null;
		
		invoker= new MerchantInvoker();
		responseString=invoker.getMerchantName("Shopclues");
		System.out.println(responseString);
	}

}
