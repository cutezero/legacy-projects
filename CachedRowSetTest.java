//CachedRowSetTest.java
import javax.sql.rowset.CachedRowSet;
import oracle.jdbc.rowset.OracleCachedRowSet;

class CachedRowSetTest
{
	public static void main(String[] args) throws Exception
	{
		CachedRowSet j=new OracleCachedRowSet();
		j.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		j.setUsername("scott");
		j.setPassword("tiger");
		j.setCommand("select * from item");
		j.execute();
		System.out.println("------Before deleting the last row--------");
		j.beforeFirst();
		while (j.next())
		{
			System.out.println(j.getString(1)+" "+j.getString(2)+" "+j.getString(3));
		}
		j.last();
		j.deleteRow();
		System.out.println("------After deleting the last row from Rowset object--------");
		j.acceptChanges();
		System.out.println("------After deleting the last row which affected to DB--------");
		j.beforeFirst();
		while (j.next())
		{
			System.out.println(j.getString(1)+" "+j.getString(2)+" "+j.getString(3));
		}
		j.close();
	}
}
