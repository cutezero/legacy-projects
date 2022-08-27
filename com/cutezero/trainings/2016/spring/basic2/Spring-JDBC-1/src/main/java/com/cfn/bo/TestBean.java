package com.cfn.bo;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cfn.dao.EmpDao;

import oracle.net.aso.e;

@Service
public class TestBean {
	@Autowired
	private EmpDao dao;
	public void m1(){
		int i=dao.updateEmp(1001, 8999);
		System.out.println(i+"row updated");
	}
	public void m2(){
		Map m=dao.findEmpById(1011);
		System.out.println(m);
	}
	public void m3(){
		List l=dao.findAllEmps();
		Iterator<e> i=l.iterator();
		while(i.hasNext())
		{
			Map m=(Map)i.next();
			System.out.println(m);
		}
	}
}
