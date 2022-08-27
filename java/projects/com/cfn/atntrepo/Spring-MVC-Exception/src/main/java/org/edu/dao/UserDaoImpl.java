package org.edu.dao;

import java.util.List;

import org.edu.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{

	private final String USER_LOGIN_QUERY="from User u where u.username=? and u.password=?";
	@Autowired
	HibernateTemplate template;
	@Override
	public void register(User user) {
		//template.save(user);
	}
	
	@Override
	public List<User> validateUser(String username, String password) {
		return (List<User>)template.find("from User u where u.password=? and u.username=?", new Object[]{password,username});
	}
	
}
