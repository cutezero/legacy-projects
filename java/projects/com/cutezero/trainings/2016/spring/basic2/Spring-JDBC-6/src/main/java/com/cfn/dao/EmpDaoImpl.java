package com.cfn.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDaoImpl implements EmpDao {
	@Autowired
	private JdbcTemplate jt;
	public void insertBatch() {
		/*Object[] obj1={11,"Aa",1234,10};
		Object[] obj2={12,"Ab",8234,10};
		Object[] obj3={13,"Ac",7234,20};
		
		List<Object[]> list=new ArrayList<Object[]>();
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		int k[]=jt.batchUpdate("insert into emp values(?,?,?,?)",list);*/
		jt.batchUpdate("insert into emp values(?,?,?,?)",new MyBatchPreparedStatementSetter());
		System.out.println("Batch Executed"+"times");
	}

}
