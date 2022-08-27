package com.epdo.accessors;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DbAccessor implements IAccessor {

	private String key;	//pass it from Spring configuration const...injection
	private List cities;
	
	public DbAccessor(String key) {
		super();
		this.key = key;
	}

	@Override
	public String getKey() {
		return key;
	}

	@Override
	public Object getData() {
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
