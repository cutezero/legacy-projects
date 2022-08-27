package com.loginapi.dto;

public class LoginStatusDTO {

	private Message message;
	private Data data;
	private int statuccode;
	public Message getMessage() {
		return message;
	}
	public void setMessage(Message message) {
		this.message = message;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	public int getStatuccode() {
		return statuccode;
	}
	public void setStatuccode(int statuccode) {
		this.statuccode = statuccode;
	}
	
}
