package com.loginapi.util;
public class ResponseDto {
	
	private Integer code;
	private String Data;
	private String Msg;
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
	
		this.code = code;
	}
	public String getData() {
		return Data;
	}
	public void setData(String data) {
		Data = data;
	}
	public String getMsg() {
		return Msg;
	}
	public void setMsg(String msg) {
		Msg = msg;
	}
	
	

}
