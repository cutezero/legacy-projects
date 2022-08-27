//Program5.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
class Program5 
{
	public static void main(String[] args) throws Exception
	{
		//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Class.forName("com.mysql.jdbc.Driver");//for MySQL
		System.out.println("Class loaded");
		//Connection con= DriverManager.getConnection("jdbc:odbc:oracledsn", "scott", "tiger");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Srikanta", "root", "root");//for MySQL
		System.out.println("Connection has opened");
		Statement st= con.createStatement();
		System.out.println("Statement created");
		//String sql= "Insert into item values(1012, 'Coolpad',8499)";
		String sql= "create table student(sid int primary key, sname varchar(15),  marks int)";
		int i= st.executeUpdate(sql);
		System.out.println(i+"rows inserted");
		st.close();
		con.close();
		System.out.println("All the required connection has been closed");

	}
}
