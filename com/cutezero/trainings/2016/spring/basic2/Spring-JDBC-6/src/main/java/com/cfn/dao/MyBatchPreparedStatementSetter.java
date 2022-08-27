package com.cfn.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;

public class MyBatchPreparedStatementSetter implements BatchPreparedStatementSetter {

	ArrayList alist1= new ArrayList();
	ArrayList alist2= new ArrayList();
	ArrayList alist3= new ArrayList();
	ArrayList alist4= new ArrayList();
	public MyBatchPreparedStatementSetter(){
		alist1.add(1);
		alist1.add(2);
		alist1.add(3);

		alist2.add("A");
		alist2.add("B");
		alist2.add("C");
		
		alist2.add(2000);
		alist2.add(2200);
		alist2.add(4500);
		
		alist2.add(10);
		alist2.add(20);
		alist2.add(30);
	}
	public int getBatchSize() {
		return 3;
	}

	public void setValues(PreparedStatement arg0, int arg1) throws SQLException {
		arg0.setInt(1, Integer.parseInt(alist1.get(arg1).toString()));
		arg0.setString(2, alist2.get(arg1).toString());
		arg0.setDouble(3, Double.parseDouble(alist3.get(arg1).toString()));
		arg0.setInt(4, Integer.parseInt(alist4.get(arg1).toString()));
	}

}
