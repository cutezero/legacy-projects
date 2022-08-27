//Program6.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
class Program6 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");//for MySQL
		System.out.println("Class has been loaded");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Srikanta", "root", "root");//for MySQL
		System.out.println("Connection opened");
		Statement st= con.createStatement();
		System.out.println("Statement object has created");
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a product ID");
		int id=s.nextInt();
		System.out.println("Enter a product Name");
		//String name=s.nextLine();  //nextLine will skip statement
		String name=s.next();
		System.out.println("Enter a product Price");
		double price=s.nextDouble();
		String sql= "insert into student values("+id+",'"+name+"',"+price+")";
		int i= st.executeUpdate(sql);
		System.out.println(i+" rows inserted");
		st.close();
		con.close();
		System.out.println("All required connections are closed");
	}
}
