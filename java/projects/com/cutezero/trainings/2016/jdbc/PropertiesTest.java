//PropertiesTest.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.io.FileInputStream;
import java.util.Properties;
class PropertiesTest 
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fis= new FileInputStream("G:/JDBC/connection.properties");
		Properties props= new Properties();
		props.load(fis);
		String s1= props.getProperty("driver");
		String s2= props.getProperty("url");
		String s3= props.getProperty("username");
		String s4= props.getProperty("pwd");
		Class.forName(s1);
		Connection con= DriverManager.getConnection(s2, s3, s4);
		Statement st= con.createStatement();
		ResultSet rs= st.executeQuery("select * from emp");
		while (rs.next())
		{
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		}
		rs.close();
		st.close();
		con.close();
	}
}
