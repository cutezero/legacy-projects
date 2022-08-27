import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import org.hibernate.jdbc.Work;

public class MyWork implements Work {

	@Override
	public void execute(Connection con) throws SQLException {
		/*CallableStatement cs=con.prepareCall("{?=call testfunction(?)}");
		cs.registerOutParameter(1, Types.DOUBLE);
		cs.setInt(2, 1011);
		cs.execute();
		double d=cs.getDouble(1);
		System.out.println("Bonus: "+d);*/
		CallableStatement cs=con.prepareCall("{call experience_pro(?,?,?)}");
		
		cs.setInt(1, 7788);
		cs.registerOutParameter(2, Types.VARCHAR);
		cs.registerOutParameter(3, Types.INTEGER);
		cs.execute();
		String s1=cs.getString(2);
		int i=cs.getInt(3);
		System.out.println("Name: "+s1+", "+i);
		cs.close();

	}

}
