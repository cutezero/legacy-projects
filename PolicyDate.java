//PolicyDate.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.text.SimpleDateFormat;

class PolicyDate 
{
	public static void main(String[] args) throws Exception
	{
		Connection c= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
		PreparedStatement ps= c.prepareStatement("insert into policy values(?,?,?,?)");
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Policy ID");
		int id= s.nextInt();
		System.out.println("Enter Policy Holder name");
		String name= s.next();
		System.out.println("Enter Policy issue date in (dd/mm/yyyy)");
		String ds1= s.next();
		System.out.println("Enter Policy ecpiry date in (dd/mm/yyyy)");
		String ds2= s.next();
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		java.util.Date d1= sdf.parse(ds1);
		java.util.Date d2= sdf.parse(ds2);
		long ms1= d1.getTime();
		long ms2= d2.getTime();
		java.sql.Date d3= new java.sql.Date(ms1);
		java.sql.Date d4= new java.sql.Date(ms2);
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setDate(3, d3);
		ps.setDate(4, d4);
		int i= ps.executeUpdate();
		System.out.println(i+ "row inserted");
		ps.close();
		c.close();
	}
}
