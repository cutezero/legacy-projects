package com.bfpp.dao;

import java.beans.ConstructorProperties;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionFactory {

	protected String driverClassName;
	protected String url;
	protected String username;
	protected String password;

	@ConstructorProperties(value = { "driverClassName","url", "username", "password" })
	public ConnectionFactory(String driverClassName, String url, String username, String password) {
		super();
		this.driverClassName = driverClassName;
		this.url = url;
		this.username = username;
		this.password = password;
	}

	Connection con = null;
	PreparedStatement pstmt = null;

	public Connection getConnection() {

		try {
			if (con == null) {
				Class.forName(driverClassName);
				con = DriverManager.getConnection(url, username, password);
			}
			System.out.println("Connection to DB has been created");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	@Override
	public String toString() {
		return "ConnectionFactory [driverClassName=" + driverClassName + ", url=" + url + ", username=" + username
				+ ", password=" + password + ", con=" + con + ", pstmt=" + pstmt + "]";
	}
	

}
