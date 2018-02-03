//Program1.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
class Program1 
{
	public static void main(String[] args) throws Exception 
	{
		System.out.println("Hello World!");
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");// for Oracle
		//Class.forName("com.mysql.jdbc.Driver");//for MySQL--invalid because its type-1
		System.out.println("Driver Loaded");

		Connection con= DriverManager.getConnection("jdbc:odbc:oracledsn", "scott", "tiger");//for Oracle
		//Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Srikanta", "root", "root");//for MySQL--invalid because its type-1
		System.out.println("Connection Opened");
		
		Statement stmt= con.createStatement();
		System.out.println("Statement object has created");
		
		String sql= "create table student(sid number(6) primary key, sname varchar2(15),  marks number(6,2))";
		stmt.executeUpdate(sql);
		System.out.println("table has been created");
		
		stmt.close();
		con.close();
		System.out.println("all required connection has been closed");
	}
}
