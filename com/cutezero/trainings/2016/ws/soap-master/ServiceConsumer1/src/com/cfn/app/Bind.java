package com.cfn.app;

public class Bind {

	public static void main(String[] args) {
		MessageSampleService mss= new MessageSampleService();
		MessageSample messageSample=mss.getMessageSamplePort();
		String result=messageSample.showMsg("Srikanta");
		System.out.println(result);
	}
}
