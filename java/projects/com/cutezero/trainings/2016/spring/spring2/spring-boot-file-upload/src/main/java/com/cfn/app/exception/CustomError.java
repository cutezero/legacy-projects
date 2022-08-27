package com.cfn.app.exception;

public class CustomError {

	protected String errCode;
	protected String description;
	
	public CustomError(String errCode, String description) {
		super();
		this.errCode = errCode;
		this.description = description;
	}
	public String getErrCode() {
		return errCode;
	}
	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "CustomError [errCode=" + errCode + ", description=" + description + "]";
	}
	
	
}
