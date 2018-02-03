//Program7.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
class Program7
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");//for MySQL
		System.out.println("Class has been loaded");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Srikanta", "root", "root");//for MySQL
		System.out.println("Connection opened");
		String sql= "insert into student values(?,?,?)";
		PreparedStatement st= con.prepareStatement(sql);
		System.out.println("Statement object has created");
		Scanner s= new Scanner(System.in);
		for (int i=1;i<=3 ;i++ )
		{
			System.out.println("Enter a product ID");
			int id=s.nextInt();
			System.out.println("Enter a product Name");
			//String name=s.nextLine();  //nextLine will skip statement
			String name=s.next();
			System.out.println("Enter a product Price");
			//double price=s.nextDouble();
			int price=s.nextInt();
			st.setInt(1,id);
			st.setString(2,name);
			st.setInt(3,price);
			int i1= st.executeUpdate();
			System.out.println(i1+" rows inserted");
		}
		st.close();
		con.close();
		System.out.println("All required connections are closed");
	}
}
