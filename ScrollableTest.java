//ScrollableTest.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.Scanner;
class ScrollableTest 
{
	public static void main(String[] args) throws Exception
	{
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
		PreparedStatement st= con.prepareStatement("select * from item", 1004, 1007);
		
		ResultSet rs= st.executeQuery();
		while (rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)/*+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6)+"\t"+rs.getString(7)+"\t"+rs.getString(8)*/);
		}
		System.out.println("============================");
		rs.afterLast();
		while (rs.previous())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)/*+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6)+"\t"+rs.getString(7)+"\t"+rs.getString(8)*/);
		}
		rs.absolute(3);
		System.out.println("============================");
		System.out.println(rs.getInt("item_id")+" "+ rs.getString("item_name")+" "+ rs.getString("price")/*+" "+ rs.getString("MGR")+" "+ rs.getString("Hiredate")+" "+ rs.getString("SAL")+" "+ rs.getString("comm")+" "+ rs.getString("Deptno")*/);
		int i= rs.getRow();
		System.out.println("Cursor position is "+ i);
/*
		CallableStatement st2= con.prepareCall("insert into item (?,?,?)", 1004, 1008);
		Scanner s= new Scanner(System.in);
		System.out.println("Enter ItemID");
		int id=s.nextInt();
		System.out.println("Enter ItemName");
		String name=s.next();
		System.out.println("Enter ItemPrice");
		float p= s.nextFloat();
		st2.setInt(1,id);
		st2.setString(2,name);
		st2.setFloat(3,p);
		int j= st2.executeUpdate();
		System.out.println("insertion successful");*/
		rs.close();
		st.close();
		//st2.close();
		con.close();
	}
}
