package com.client.mobileresource.invoker;

import com.client.mobileresource.dto.Mobile;
import com.client.mobileresource.dto.Specification;

public class MobileTest {

	public static void main(String[] args) {
		MobileResource mobileResource= null;
		Specification specification=null;
		Mobile mobile= null;
		
		mobileResource= new MobileResource();
		mobile= new Mobile();
		mobile.setModel("Note3");
		mobile.setBrand("Coolpad");
		mobile.setRam(2);
		mobile.setPrice(890);
		specification=mobileResource.addMobile(mobile);
		
		System.out.println(specification.getModel());
	}
	
}
