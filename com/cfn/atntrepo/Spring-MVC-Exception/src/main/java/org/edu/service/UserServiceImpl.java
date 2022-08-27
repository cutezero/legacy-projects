package org.edu.service;

import java.util.List;

import javax.transaction.Transactional;

import org.edu.dao.UserDao;
import org.edu.entities.User;
import org.edu.exce.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userdao;
	
	@Override
	@Transactional
	public void register(User user) {
		userdao.register(user);
	}


	@Override
	@Transactional
	public boolean validateUser(String username, String password) throws UserNotFoundException {
		List<User> user=userdao.validateUser(username, password);
		//System.out.println(user);
		if(user.isEmpty()){
			throw new UserNotFoundException("user not found exception please enter valid details");
		}
		return true;
	}

}
