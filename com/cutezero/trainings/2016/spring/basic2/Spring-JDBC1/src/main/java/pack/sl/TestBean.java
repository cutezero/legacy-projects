package pack.sl;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pack.dao.EmpDao;

@Service
public class TestBean 
{
	@Autowired
	private EmpDao dao;
	
	public void m1()
	{
		int i=dao.updateEmp(1001, 5000);
		System.out.println(i+"row updated");
	}
	public void m2()
	{
		Map m=dao.findEmp(1011);
		System.out.println(m);
	}
	public void m3()
	{
		List l=dao.findAllEmps();
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			Map m=(Map)it.next();
			System.out.println(m);
		}
		
	}
}
