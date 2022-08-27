package com.cfn.app;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmpDaoImpl implements IEmpDao {

	private JdbcTemplate jt;
	
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public void transactionMethod() {
		jt.update("insert into dept values(40,'Account','HYD')");
		jt.update("update emp set sal=3435 where empno=7788");
		try{
			Thread.sleep(10000);
		}catch (InterruptedException e) {
			System.out.println("somethings wrong");
			e.printStackTrace();
		}
		jt.update("delete from test1 where  eid1=1");
	}

}
