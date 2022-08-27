package com.cfn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cfn.dao.IUserDao;

@RestController
public class UserController {

	@Autowired
	private IUserDao dao;
	
	@RequestMapping(value="/getUsers", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<User>> getAllUsers(){
		
		List<User> usersList=dao.findAllUsers();
		return new ResponseEntity<List<User>>(usersList, HttpStatus.OK);
	}
	
	@RequestMapping(value="/getUserById/{id}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> findUserId(@PathVariable("id") int id){
		User user=dao.findUserById(id);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
	@RequestMapping(value="/addUser", method=RequestMethod.POST)
	public String addUser(@RequestBody User user){
		String str=dao.addUser(user);
		return str;
	}
}
