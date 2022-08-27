package org.edu.dao;

import java.util.List;

import org.edu.entities.Login;
import org.edu.entities.User;

public interface UserDao {
	
	 void register(User user);
	 List<User> validateUser(String username, String password);
	  
}
