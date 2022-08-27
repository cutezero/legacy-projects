package com.cfn.sl;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cfn.dao.EmpDao;
import com.cfn.dto.Employee;


@Service
public class TestBean {
	@Autowired
	private EmpDao dao;
	public void persistEmp(int empno, String empName, int sal, int deptno){
		Employee e=new Employee();
		e.setEmpId(empno);
		e.setEmpName(empName);
		e.setEmpSalary(sal);
		e.setDeptNo(deptno);
		dao.saveOrUpdateEmployee(e);
	}
	public void updateEmp(int empno, String empName, int sal, int deptno){
		Employee e=new Employee();
		e.setEmpId(empno);
		e.setEmpName(empName);
		e.setEmpSalary(sal);
		e.setDeptNo(deptno);
		dao.saveOrUpdateEmployee(e);
	}
	public void deleteEmp(int empId){
		dao.deleteEmployee(empId);
	}
	public void selectEmps(){
		List list=dao.selectEmployees();
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			Employee e=(Employee)it.next();
			System.out.println(e);
		}
	}
}
