package com.app.paramconverters;

import javax.ws.rs.ext.ParamConverter;

import com.app.bean.AwbNo;


public class AwbNoParamConverter implements ParamConverter<AwbNo>{

	@Override
	public AwbNo fromString(String awbNo) {
		return new AwbNo(awbNo.substring(0, 3), Integer.parseInt(awbNo.substring(3)));
	}

	@Override
	public String toString(AwbNo awbNo) {
		return awbNo.getDestination()+""+awbNo.getZipCode();
	}

	
}
