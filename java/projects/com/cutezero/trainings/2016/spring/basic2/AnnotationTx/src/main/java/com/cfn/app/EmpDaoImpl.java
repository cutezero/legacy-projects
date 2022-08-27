package com.cfn.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmpDaoImpl implements IEmpDao {

	@Autowired
	private JdbcTemplate jt;

	@Transactional(propagation=Propagation.REQUIRES_NEW, isolation=Isolation.READ_COMMITTED, timeout=10)
	public void transactionMethod() {
		jt.update("insert into dept values(60,'Computer','MUMBAI')");
		jt.update("update emp set sal=3435 where empno=7788");
		try{
			Thread.sleep(10000);
		}catch (Exception e) {
			e.printStackTrace();
		}
		jt.update("delete from test1 where  eid1=1");
	}

}
