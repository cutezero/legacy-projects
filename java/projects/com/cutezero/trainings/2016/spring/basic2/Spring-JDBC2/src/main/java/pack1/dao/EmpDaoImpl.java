package pack1.dao;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class EmpDaoImpl implements EmpDao 
{
	@Autowired
	private JdbcTemplate jt;
	public Object findEmps() 
	{
		Set set=(Set)jt.query("select * from emp",new EmployeeExtractor());
		return set;
	}

}
