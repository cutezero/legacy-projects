package com.acc.service;

import java.util.List;

import com.acc.bo.MobileBo;
import com.acc.dao.MobileDao;
import com.acc.dto.MobileDto;

public class MobileService {

	private MobileDao mobileDao;
    
	public void setMobileDao(MobileDao mobileDao) {
		this.mobileDao = mobileDao;
	}

	public List<MobileBo> getSearchedMobile(MobileDto dto){
		
		return mobileDao.getSearchedMobile(dto);
	}
}
