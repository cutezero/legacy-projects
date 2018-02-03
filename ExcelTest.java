//ExcelTest.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

class ExcelTest
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		//Class.forName("org.relique.jdbc.csv.CsvDriver");
		Connection c= DriverManager.getConnection("jdbc:odbc:Exceldsn");
		//Connection c= DriverManager.getConnection("jdbc:relique:csv:G:/MyFolder");
		Statement ps= c.createStatement();
		ResultSet rs= ps.executeQuery("select * from [Sheet1$]");
		while (rs.next())
		{
			
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			//System.out.println("=========================================");
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
