package com.at.helper;

import org.springframework.stereotype.Component;

@Component
public class DataSourceConnectionHelper {

	/**
	 * I have not used this class 
	 * But it can be used to populate the db connection data
	 * to the datasource properties(attributes)
	 */
	private String dbName;
	private String driverClassName;
	private String url;
	private String username;
	private String password;
	
	
	public String getDbName() {
		return dbName;
	}
	public void setDbName(String dbName) {
		this.dbName = dbName;
	}
	public String getDriverClassName() {
		return driverClassName;
	}
	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
