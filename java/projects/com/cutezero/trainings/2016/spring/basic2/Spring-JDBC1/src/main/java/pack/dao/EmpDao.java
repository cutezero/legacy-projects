package pack.dao;

import java.util.List;
import java.util.Map;

public interface EmpDao 
{
	int updateEmp(int empno,int sal);
	Map findEmp(int empno);
	List findAllEmps();
}
