package com.cfn.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cfn.service.User;

@Repository
public class UserDaoImpl implements IUserDao {

	@Autowired
	private JdbcTemplate jt;
	
	@SuppressWarnings("unchecked")
	public List<User> findAllUsers() {
		List<User> usersList=jt.query("select * from users", new UserMapper());
		return usersList;
	}

	@SuppressWarnings("unchecked")
	public User findUserById(int id) {
		List<User> user=jt.query("select * from users where userid=?", new UserMapper(),id);
		return (User)user.get(0);
	}

	public String addUser(User user) {
		String str;
		int id=user.getId();
		String name=user.getName();
		int i=jt.update("insert into users values(?,?)", id, name);
		if (i==1){
			str="User is inserted";
		}
		else{
			str="User is already exist";
		}
		return str;
	}

}
