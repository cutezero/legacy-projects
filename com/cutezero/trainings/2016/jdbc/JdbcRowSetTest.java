//JdbcRowSetTest.java
import javax.sql.rowset.JdbcRowSet;
import oracle.jdbc.rowset.OracleJDBCRowSet;
class JdbcRowSetTest 
{
	public static void main(String[] args) throws Exception
	{
		JdbcRowSet j= new OracleJDBCRowSet();
		j.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		j.setUsername("scott");
		j.setPassword("tiger");
		j.setCommand("select * from item");
		j.execute();
		System.out.println("---------Forward---------------");
		while(j.next())
		{
			System.out.println(j.getInt(1)+" "+j.getString(2)+" "+j.getInt(3));
		}
		System.out.println("---------Backward-----------------");
		j.afterLast();
		while(j.previous())
		{
			System.out.println(j.getInt(1)+" "+j.getString(2)+" "+j.getInt(3));
		}
		System.out.println("------Relative to 4th--------------");
		j.next();
		j.relative(4);
		while(j.previous())
		{
			System.out.println(j.getInt(1)+" "+j.getString(2)+" "+j.getInt(3));
		}
		System.out.println("------Aboslute to 3rd----------------");
		j.absolute(3);
		while (j.next())
		{
			System.out.println(j.getInt(1)+" "+j.getString(2)+" "+j.getInt(3));
		}
		
		j.close();

	}
}
