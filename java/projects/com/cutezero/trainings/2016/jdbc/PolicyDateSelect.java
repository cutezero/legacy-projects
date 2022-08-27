//PolicyDateSelect.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

class PolicyDateSelect
{
	public static void main(String[] args) throws Exception
	{
		Connection c= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
		Statement ps= c.createStatement();
		ResultSet rs= ps.executeQuery("select * from policy");
		while (rs.next())
		{
			int policyid=rs.getInt(1);
			String policyholder=rs.getString(2);
			java.sql.Date d1=rs.getDate(3);
			java.sql.Date d2=rs.getDate(4);
			java.util.Date d3= (java.util.Date)d1;
			java.util.Date d4= (java.util.Date)d2;
			SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
			java.lang.String issuedate= sdf.format(d3);
			java.lang.String expiredate= sdf.format(d4);
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			System.out.println("=========================================");
			/*System.out.println("policy NO: "+policyid);
			System.out.println("policy Holder: "+policyholder);
			System.out.println("policy issue date: "+issuedate);
			System.out.println("policy expiry date: "+expiredate);
			System.out.println("=========================================");*/

		}
		ps.close();
		c.close();
	}
}
