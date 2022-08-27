package com.cfn.app;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class MessageSample {

	@WebMethod
	public String showMsg(String m){
		return "Hello"+m;
	}
}
