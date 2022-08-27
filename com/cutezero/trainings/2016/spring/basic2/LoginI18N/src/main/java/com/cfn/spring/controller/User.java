package com.cfn.spring.controller;

import org.hibernate.validator.constraints.NotEmpty;

public class User {
	@NotEmpty
	private String uname;
	
	@NotEmpty
	private String pwd;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
