//ProcedureCall.java
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.Types;
import java.util.Scanner;
public class ProcedureCall
{
	public static void main(String [] args) throws Exception
	{
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
		CallableStatement cs= con.prepareCall("{call experience_pro(?,?,?)}");
		Scanner s= new Scanner(System.in);
		System.out.println("Enter employee No. to find the experience");
		int id= s.nextInt();
		cs.setInt(1,id);
		cs.registerOutParameter(2, Types.VARCHAR);
		cs.registerOutParameter(3, Types.INTEGER);
		cs.execute();
		String s1= cs.getString(2);
		int k= cs.getInt(3);
		System.out.println("Employee name: "+s1+" is having experiance of "+k);
		cs.close();
		con.close();
	}
}