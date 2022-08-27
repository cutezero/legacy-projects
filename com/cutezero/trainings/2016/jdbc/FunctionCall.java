//FunctionCall.java
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.Types;
import java.util.Scanner;
class FunctionCall 
{
	public static void main(String[] args) throws Exception
	{
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
		CallableStatement cs= con.prepareCall("{?=call emp_bonus(?)}");
		cs.registerOutParameter(1, Types.INTEGER);
		Scanner s= new Scanner(System.in);
		System.out.println("Enter employee number: ");
		int eno= s.nextInt();
		cs.setInt(2, eno);
		cs.execute();
		int i1= cs.getInt(1);
		System.out.println(i1+ "is the bonus of" +eno);
		cs.close();
		con.close();
	}
}
