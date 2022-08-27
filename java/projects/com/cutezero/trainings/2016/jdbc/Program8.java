//Program8.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import java.io.IOException;
import java.io.FileInputStream;
public class  Program8
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("Hello World!");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Srikanta","root", "root");
		//PreparedStatement pst= con.prepareStatement("create table emps_images (empno int primary key, empname varchar(10), description varchar(20), photos blob)");
		PreparedStatement ps= con.prepareStatement("insert into emps_images values(?,?,?,?)");
		ps.setInt(1, 222);
		ps.setString(2, "Srikanta");
		ps.setString(3, "good Boy");
		FileInputStream fis= new FileInputStream("C:/Users/rSikanta.ydon/Pictures/Nikhil and pooja.jpg");
		ps.setBlob(4, fis);
		//int j= pst.executeUpdate();

		int i= ps.executeUpdate();
		ps.close();
		con.close();
	}
}
