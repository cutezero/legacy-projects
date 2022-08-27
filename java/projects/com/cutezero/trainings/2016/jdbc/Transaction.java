//Transaction.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
class Transaction 
{
	public static void main(String[] args) throws Exception
	{
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
		Statement st= con.createStatement();
		System.out.println("Your st created");

		con.setAutoCommit(false);
		try{
			st.executeUpdate("insert into item values(1021, 'Leco', 12000)");
			System.out.println("Your query1 has completed");

			st.executeUpdate("insert into item values(1022, 'Moto G4', 13200)");
			System.out.println("Your query2 has completed");

			st.executeUpdate("update item set price=9000 where item_id=1012 ");
			System.out.println("Your query3 has completed");

			st.executeUpdate("update emp set sal=9000 where Empno=7369 ");
			con.commit();
			System.out.println("Your query has completed");
		}
		catch(Exception e)
		{
			con.rollback();
			System.out.println("Transaction failed");
		}
		st.close();
		con.close();
	}
}
