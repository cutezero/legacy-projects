//PreparedBatch.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
class PreparedBatch 
{
	public static void main(String[] args) throws Exception
	{
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
		PreparedStatement ps= con.prepareStatement("insert into item values (?,?,?)");
		
		Scanner s= new Scanner(System.in);
		for (int i=1;i<3 ;i++ )
		{
		System.out.println("Enter Item ID");
		int id= s.nextInt();
		System.out.println("Enter Item Name");
		String name= s.next();
		System.out.println("Enter price :");
		int p= s.nextInt();
		
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setInt(3, p);
		ps.addBatch();
		}
		int i2[]= ps.executeBatch();
		System.out.println("Batch excuted");
		ps.close();
		con.close();

	}
}
