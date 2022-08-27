package com.cfn.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cfn.dao.EmpDao;

@Service
public class DemoBean {
	@Autowired
	private EmpDao dao;
	
	public void bm(){
		dao.insertBatch();
	}
}
