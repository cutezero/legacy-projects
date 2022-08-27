//WebRowSetTest.java
import javax.sql.rowset.WebRowSet;
import oracle.jdbc.rowset.OracleWebRowSet;

class WebRowSetTest
{
	public static void main(String[] args) throws Exception
	{
		WebRowSet j=new OracleWebRowSet();
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
		j.first();
		j.deleteRow();
		System.out.println("------After deleting the last row from Rowset object--------");
		j.acceptChanges();
		System.out.println("------After deleting the last row which affected to DB--------");
		j.beforeFirst();
		while (j.next())
		{
			System.out.println(j.getString(1)+" "+j.getString(2)+" "+j.getString(3));
		}
		java.io.FileWriter writer= new java.io.FileWriter("G:/JDBC/Empsdata.xml");
		j.writeXml(writer);
		System.out.println("Xml file created succesfully");
		System.out.println("you can see the xml file at JDBC folder of G drive");
		j.close();
	}
}
