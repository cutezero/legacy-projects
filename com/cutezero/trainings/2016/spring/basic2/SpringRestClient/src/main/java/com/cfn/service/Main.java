package com.cfn.service;


import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.web.client.RestTemplate;

public class Main {

	public static void main(String[] args) {
		RestTemplate restTemplate= new RestTemplate();
		String url="http://localhost:2017/SpringRest2/rest/getUsers";
		List usersList= restTemplate.getForObject(url, List.class);
		Iterator it= usersList.iterator();
		while(it.hasNext()){
			LinkedHashMap hashMap= (LinkedHashMap) it.next();
			System.out.println(hashMap);
		}
			System.out.println("======================");

			String url2="http://localhost:2017/SpringRest2/rest/getUserById/1234";
			User user= restTemplate.getForObject(url2, User.class);
			System.out.println(user.getId()+": "+user.getName());
			System.out.println("======================");
			
			String url3="http://localhost:2017/SpringRest2/rest/addUser";
			User newUser= new User();
			int id=1231;
			String name="sri";
			newUser.setId(id);
			newUser.setName(name);
			String str= restTemplate.postForObject(url3, newUser, String.class);
			System.out.println(str);
			
	}

}
