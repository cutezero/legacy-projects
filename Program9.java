//Program9.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.io.IOException;
import java.io.FileOutputStream;
class Program9 
{
	public static void main(String[] args) throws Exception
	{
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Srikanta", "root", "root");
		PreparedStatement pst= con.prepareStatement("Select photos from emps_images where empno=?");
		pst.setInt(1,222);
		ResultSet rs= pst.executeQuery();
		rs.next();
		byte b[]= rs.getBytes(1);
		FileOutputStream fos= new FileOutputStream("G:/demo.jpeg");
		fos.write(b);
		rs.close();
		pst.close();
		con.close();
		System.out.println("Succes");
	}
}
