package pack.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class EmpDaoImpl implements EmpDao 
{
	@Autowired
	private JdbcTemplate jt;
	
	public int updateEmp(int empno, int sal) 
	{
		int i=jt.update("update emp set sal=? where empno=?",sal,empno);
		return i;
	}

	public Map findEmp(int empno) 
	{
		Map m=jt.queryForMap("select * from emp where empno=?",empno);
		return m;
	}

	public List findAllEmps() 
	{
		List l=jt.queryForList("select * from emp");
		return l;
	}

}
