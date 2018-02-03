//JoinRowSetTest.java
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JoinRowSet;
import oracle.jdbc.rowset.OracleCachedRowSet;
import oracle.jdbc.rowset.OracleJoinRowSet;

class JoinRowSetTest
{
	public static void main(String[] args) throws Exception
	{
		CachedRowSet j=new OracleCachedRowSet();
		j.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		j.setUsername("scott");
		j.setPassword("tiger");
		j.setCommand("select * from book");
		j.execute();
		j.beforeFirst();
		while (j.next())
		{
			System.out.println(j.getString(1)+" "+j.getString(2));
		}
		System.out.println("------2nd -------");
		CachedRowSet c=new OracleCachedRowSet();
		c.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		c.setUsername("scott");
		c.setPassword("tiger");
		c.setCommand("select * from author");
		c.execute();
		//c.beforeFirst();
		while (c.next())
		{
			System.out.println(c.getString(1)+" "+c.getString(2)+" "+c.getString(3));
		}
		JoinRowSet jr= new OracleJoinRowSet();
		jr.addRowSet(j,"bid");
		jr.addRowSet(c,"bid");

		System.out.println("------after join -------");

		while (jr.next())
		{
			System.out.println(jr.getString(1)+" /t"+jr.getString(2)+" /t"+jr.getString(3)+" /t"+jr.getString(4));
		}
		j.close();
		c.close();
		jr.close();
	}
}
