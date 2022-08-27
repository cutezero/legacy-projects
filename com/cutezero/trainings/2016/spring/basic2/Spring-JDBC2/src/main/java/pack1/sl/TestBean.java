package pack1.sl;

import java.util.Iterator;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pack1.dao.EmpDao;
import pack1.dao.Employee;

@Service
public class TestBean 
{
	@Autowired
	private EmpDao empDao;
	public void readEmps()
	{
		Object o=empDao.findEmps();
		Set set=(Set)o;
		Iterator it=set.iterator();
		while(it.hasNext())
		{
			Employee e=(Employee)it.next();
			System.out.println(e);
		}
	}
}
