//PostgreSqlTest.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class PostgreSqlTest 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("org.postgresql.Driver");
		Connection con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
		Statement st= con.createStatement();
		st.executeUpdate("create table student(sid integer primary key, sname text, marks integer)");
		System.out.println("Table created");
		int i= st.executeUpdate("insert into student values( 1011, 'Lucky', 550)");
		System.out.println(i+ "rows inserted");
		st.close();
		con.close();
	}
}
