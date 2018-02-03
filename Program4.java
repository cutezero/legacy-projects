//Program4.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.SQLException;
class Program4 
{
	public static void main(String[] args) 
	{
		Connection con= null;
		Statement st= null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			st= con.createStatement();
			Scanner s= new Scanner(System.in);
			System.out.println(" Enter the Item id of which price need to be updated");
			int i= s.nextInt();
			System.out.println("Enter the price of the item");
			double p= s.nextDouble();
			String sql= "update item set price= "+p+" where item_id= "+i;
			int k= st.executeUpdate(sql);
			System.out.println(k+"row updated");
		}
		catch (ClassNotFoundException e1)
		{
			System.err.println(e1);
		}
		catch (SQLException e2)
		{
			System.out.println(e2);
		}
		catch (Exception e3)
		{
			System.out.println(e3);
		}
		finally 
		{
			try
			{
				if (st!=null)
				{
					st.close();
				}
				if (con!=null)
				{
					con.close();
				}
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
//classpath=C:\app\Srikanta.ydon\product\11.2.0\dbhome_1\jdbc\lib\ojdbc6.jar;.