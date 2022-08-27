package com.cfn.sl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cfn.bo.Dao;

@Service("tb")
public class TestBean {
	@Autowired
	private Dao dao;
	public void readBonus(int empNo){
		BigDecimal bd= dao.findBonus(empNo);
		System.out.println("Bonus: "+bd.toString());
	}
}
