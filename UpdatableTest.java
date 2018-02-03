//UpdatableTest.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;
class UpdatableTest 
{
	public static void main(String[] args) throws Exception
	{
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
		Statement st= con.createStatement(1004,1008);
		//Statement st= con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs= st.executeQuery("select Item_ID, Item_name, price from item");
		while(rs.next())
		{
			System.out.println(rs.getInt("item_id")+" \t"+rs.getString("Item_name")+" \t"+rs.getDouble("price"));
		}
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Item ID");
		int id= s.nextInt();
		System.out.println("Enter Item name");
		String name= s.next();
		System.out.println("Enter Price of the Item");
		int p1= s.nextInt();
		
		rs.moveToInsertRow();
		rs.updateInt(1, id);
		rs.updateString(2, name);
		rs.updateDouble(3, p1);
		rs.insertRow();
		System.out.println("insertion succes");
		rs.absolute(4);
		rs.updateString(2, "systema");
		rs.updateRow();
		System.out.println("Updation success");

		/*rs.absolute(4);
		rs.deleteRow();
		System.out.println("Deletion success");*/
		rs.close();
		st.close();
		con.close();
	}
}
