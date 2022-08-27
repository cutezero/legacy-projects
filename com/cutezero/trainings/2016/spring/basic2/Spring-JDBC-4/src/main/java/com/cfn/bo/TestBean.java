package com.cfn.bo;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cfn.dao.EmpDao;

@Service
public class TestBean {
	@Autowired
	private EmpDao dao;
	public void modifyEmp(int empno, int sal){
		int k=dao.updateEmp(empno, sal);
		System.out.println(k+" row updated");
	}
	public void readEmps(int deptno){
		List list= dao.findEmps(deptno);
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			Map m=(Map)it.next();
			System.out.println(m);
		}
	}
}
