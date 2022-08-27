package com.app.btier.service;

import java.util.List;

import com.app.bo.RechargeDetailsBo;
import com.app.btier.dao.RechargeDao;

public class RechargeManagerService {

	private RechargeDao rechargeDao;
	
	
	public RechargeDao getRechargeDao() {
		return rechargeDao;
	}


	public void setRechargeDao(RechargeDao rechargeDao) {
		this.rechargeDao = rechargeDao;
	}


	public List<RechargeDetailsBo> getRechargeHistory(){
		return rechargeDao.getRechargeHistory();
	}
}
