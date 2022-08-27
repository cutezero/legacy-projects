//Savepoint1.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Savepoint;
class Savepoint1 
{
	public static void main(String[] args) throws Exception
	{
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
		Statement st= con.createStatement();
		System.out.println("Your st created");

		con.setAutoCommit(false);
		Savepoint sp=null;
		int i=0;

		try{
			

			st.executeUpdate("update item set price=8499 where item_id=1012 ");
			System.out.println("Your query1 has completed");

			st.executeUpdate("update emp set sal=210 where Empno=7369 ");
			System.out.println("Your query2 has completed");

			sp= con.setSavepoint();
			i=1;
			st.executeUpdate("insert into item values(1019, 'iball', 7000)");
			System.out.println("Your query3 has completed");

			st.executeUpdate("insert into item values(1015, 'Swipe', 4000)");
			
			con.commit();
			System.out.println("Your query has completed");
		}
		catch(Exception e)
		{
			if (i==1)
			{
				con.rollback(sp);
				System.out.println("2nd part cancelled");
			}
			else
			{
				con.rollback();
				System.out.println("Entire Transaction failed");
			}
		}
		st.close();
		con.close();
	}
}
