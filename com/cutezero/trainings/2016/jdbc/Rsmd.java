//Rsmd.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
class Rsmd 
{
	public static void main(String[] args) 
	{
		Connection con= null;
		Statement ps= null;
		try
		{
		con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
		ps= con.createStatement();
		
		ResultSet rs= ps.executeQuery("select * from item");
		ResultSetMetaData rsmd= rs.getMetaData();
		int count= rsmd.getColumnCount();
		for (int i=1;i<=count ;i++ )
		{
			System.out.println("Column Index is: "+i);
			System.out.println("Column Name is: "+rsmd.getColumnName(i));
			System.out.println("Column Type is: "+rsmd.getColumnTypeName(i));
			System.out.println("Column size is: "+rsmd.getColumnDisplaySize(i));
		}
		
		System.out.println("Batch excuted");
		rs.close();
		}
		catch (SQLException se)
		{
			System.err.println(se);
		}
		catch (Exception e)
		{
			System.err.println(e);
		}
		finally
		{
			try
			{
				if (ps!=null)
				{
					ps.close();
				}
				if (ps!=null)
				{
					con.close();
				}
			}
			catch (Exception e)
			{
				System.err.println(e);
			}
		}
	}
}
