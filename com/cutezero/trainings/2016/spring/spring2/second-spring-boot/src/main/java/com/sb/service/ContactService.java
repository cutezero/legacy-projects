package com.sb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.dao.ContactBo;
import com.sb.dao.ContactDao;

@Service
public class ContactService {
	
	@Autowired
	private ContactDao contactDao; 
	public List<ContactBo> getContactByMobileNo(){
		List<ContactBo> contacts=contactDao.getContactsByMobile();
		return contacts;
	}
}
