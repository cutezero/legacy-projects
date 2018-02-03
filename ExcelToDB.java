//ExcelToDB.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class ExcelToDB
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		System.out.println("ODBC Driver Loaded ");

		Connection c1= DriverManager.getConnection("jdbc:odbc:Exceldsn");
		System.out.println("First Connection Sucess");

		Connection c2= DriverManager.getConnection("jdbc:odbc:oracledsn", "scott", "tiger");
		System.out.println("Second Connection Sucess");

		Statement s= c1.createStatement();
		System.out.println("First Statement Sucess");
		PreparedStatement ps= c2.prepareStatement("insert into item values (?,?,?)");
		System.out.println("Second Statement Sucess");

		ResultSet rs= s.executeQuery("select * from [Sheet1$]");
		while (rs.next())
		{
			ps.setInt(1,rs.getInt(1));
			ps.setString(2,rs.getString(2));
			ps.setInt(3,rs.getInt(3));
			ps.executeUpdate();
			//System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));			
		}
		System.out.println("insertion Sucess);
		s.close();
		ps.close();
		c1.close();
		c2.close();
	}
}
