package com.aop.after.beans;

public class OnlineRecharge {

	public String rechargeMobile(String mobileNo, int amount){
		String message= null;
		message="Recharging mobile No : "+mobileNo+ " with Plan : "+amount;
		System.out.println("Recharging mobile No : "+mobileNo+ " with Plan : "+amount);
		switch (amount) {
		case 100:
			message= "Recharging standard Top up of : "+amount;
			break;
		case 349:
			message= "Recharging Unlimited (84days)Top up of : "+amount;
			break;
		case 1000:
			message= "Recharging Family Pack Top up of : "+amount;
			break;
		case 5000:
			message= "Recharging Family Pack Top up of : "+amount;
			break;
		
		default:
			message= "Can not Recharge with this amount : "+amount;
			message= "Failed";
			break;
		}
		
		return message;
	}
}
