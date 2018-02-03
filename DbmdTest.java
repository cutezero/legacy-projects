//DbmdTest.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.DatabaseMetaData;
class DbmdTest 
{
	public static void main(String[] args) throws Exception
	{
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Srikanta", "root", "root");//for MySQL
		//Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
		DatabaseMetaData d= con.getMetaData();
		System.out.println("Database name is : "+ d.getDatabaseProductName());
		System.out.println("Database version is : "+ d.getDatabaseProductVersion());
		System.out.println("Max column in table : "+ d.getMaxColumnsInTable());
		System.out.println("Max table Length: "+ d.getMaxTableNameLength());
		System.out.println("Max column Length: "+ d.getMaxColumnNameLength());
		System.out.println("supports Transaction? : "+ d.supportsTransactions());
		System.out.println("supports Savepoints? : "+ d.supportsSavepoints());
		System.out.println("Driver name : "+ d.getDriverName());
		System.out.println("Driver Version : "+ d.getDriverVersion());
		con.close();
	}
}
