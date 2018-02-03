//BatchProcess.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
class BatchProcess 
{
	public static void main(String[] args) throws Exception
	{
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
		Statement st= con.createStatement();
		st.addBatch("insert into item values(1234, 'Cable', 890)");
		st.addBatch("update item set price= 290 where item_name='lg' ");
		st.addBatch("delete from item where price>10000");
		int[] i=st.executeBatch();
		System.out.println(i);
		System.out.println("Batch Processed succesfully");
		st.close();
		con.close();
	}
}
