package com.cfn.bo;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;
@Repository
public class DaoImpl implements Dao {
	@Autowired
	private SimpleJdbcCall sjc;
	
	public BigDecimal findBonus(int empNo) {
		sjc.withFunctionName("emp_bonus");
		Map inMap=new HashMap();
		inMap.put("eno", empNo);
		Map outMap=sjc.execute(inMap);
		BigDecimal bd=(BigDecimal) outMap.get("return");
		return bd;
	}

}
