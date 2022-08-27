package com.epdo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;



// Dummy Test class
public class DBTest {

	public static void main(String[] args) {
		Map<String, String> map=(Map) getData();
		for (Entry<String, String> entry : map.entrySet()){
			System.out.println("Key : "+entry.getKey()+ " value :"+entry.getValue());
		}
	}
	
	public static Object getData() {
		//JDBC Logic 
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		String sql=null;
		String driverClassName=null;
		String driverUrl=null;
		String username=null;
		String password=null;
		
		Map<String, String> citiesMap;
		citiesMap=new HashMap<>();
			try {
				
/*				driverClassName="oracle.jdbc.driver.OracleDriver";
				driverUrl="jdbc:oracle:thin:@local:1521:orcl";
				username="scott";
				password="tiger";
*/
				driverClassName="com.mysql.jdbc.Driver";
				driverUrl="jdbc:mysql://localhost/Srikanta";
				username="root";
				password="root";
				
				sql="select * from tbl_cities";
				
				Class.forName(driverClassName);
				con=DriverManager.getConnection(driverUrl, username, password);
				stmt=con.createStatement();
				rs=stmt.executeQuery(sql);
				while(rs.next()){
					citiesMap.put(rs.getString(1), rs.getString(2));
					System.out.println("City ID : "+rs.getString("c_id")+" - City Name : "+rs.getString("c_name"));
				}
				
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		//get the List of cities from DB and return
		return citiesMap;
	}

}
