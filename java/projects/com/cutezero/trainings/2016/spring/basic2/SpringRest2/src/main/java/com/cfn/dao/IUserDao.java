package com.cfn.dao;

import java.util.List;

import com.cfn.service.User;

public interface IUserDao {

	List<User> findAllUsers();
	
	User findUserById(int id);
	String addUser(User uesr);
}
