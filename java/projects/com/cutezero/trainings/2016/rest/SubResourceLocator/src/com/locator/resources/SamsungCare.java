package com.locator.resources;

import javax.inject.Singleton;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/samsung-care")
//@Singleton		//It doesn't work in resteasy
public class SamsungCare {

	/**
	 * Singleton scope to subResource class
	 * @return
	 */
	
	
	private MobileCare mobileCare; 				//#1
	private AccessoriesCare accessoriesCare; 	//#2
	
	public SamsungCare() {
		super();
		this.mobileCare = new MobileCare();
		this.accessoriesCare = new AccessoriesCare();
	}

	@Path("mobile")
	public MobileCare getMobileCare() {
		System.out.println(" Hash Code of Resource class : "+this.hashCode());
//		return new MobileCare();
		return mobileCare;			//#1
	}
	
	@Path("/accessories")
	public AccessoriesCare getAccessoriesCare() {
		return new AccessoriesCare();
//		return accessoriesCare;		//#2
	}
	
/*	
	@Path("{productType}")
	public Object getProductType(@PathParam("productType")String productType) {
		switch (productType) {
		case "mobile":
			return new MobileCare();
		case "accessories":
			return new AccessoriesCare();
		default:
			return null;
		}
	}
*/	
}
