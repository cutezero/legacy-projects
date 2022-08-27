package com.cfn.bo;

import java.util.Iterator;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cfn.dao.EmpDao;
import com.cfn.dao.Employee;

@Service
public class TestBean {
	@Autowired
	private EmpDao dao;
	public void readEmps(){
		Set set=(Set)dao.findEmps();
		Iterator it=set.iterator();
		while(it.hasNext())
		{
			Employee e= (Employee)it.next();
			System.out.println(e);
		}
	}
}
