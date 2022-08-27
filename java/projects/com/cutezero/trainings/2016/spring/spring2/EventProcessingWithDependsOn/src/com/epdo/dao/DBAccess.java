package com.epdo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class DBAccess {

	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	String sql = null;
	String driverClassName = null;
	String driverUrl = null;
	String username = null;
	String password = null;

	Map<String, String> citiesMap;

	public Object getDataFromDB() {
		// JDBC Logic
		citiesMap = new HashMap<>();
		try {
			connect2DB();
			sql = "select * from tbl_cities";
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				citiesMap.put(rs.getString(1), rs.getString(2));
				System.out.println("City ID : " + rs.getString("c_id") + " - City Name : " + rs.getString("c_name"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// get the List of cities from DB and return
		return citiesMap;
	}

	public void insertData2DB(String cityId, String cityName) {
		connect2DB();
		
		sql = "insert into tbl_cities values ('"+cityId+"', '"+cityName+"')";
		try {
//			int id= stmt.executeUpdate(sql);
			int id= stmt.executeUpdate(sql);
			if ( id>=1)
				System.out.println("Successfully inserted "+id + " rows");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void connect2DB() {
		/*
		 * driverClassName="oracle.jdbc.driver.OracleDriver";
		 * driverUrl="jdbc:oracle:thin:@local:1521:orcl"; username="scott";
		 * password="tiger";
		 */
		driverClassName = "com.mysql.jdbc.Driver";
		driverUrl = "jdbc:mysql://localhost/Srikanta";
		username = "root";
		password = "root";


		try {
			Class.forName(driverClassName);
			con = DriverManager.getConnection(driverUrl, username, password);
			stmt = con.createStatement();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
