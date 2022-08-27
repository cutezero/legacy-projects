package org.edu.service;

import org.edu.entities.User;
import org.edu.exce.UserNotFoundException;

public interface UserService {
	 void register(User user);
	 boolean validateUser(String username, String password) throws UserNotFoundException;
}
