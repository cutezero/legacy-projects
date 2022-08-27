package com.annotation.aspectj.config.helper;

import org.springframework.stereotype.Component;

@Component
public class AuthenticationHelper {

	private ThreadLocal<UserInfo> threadLocal;
	
	private AuthenticationHelper(){
		//Singleton
		threadLocal= new ThreadLocal<>();
	}
	private static class AuthenticationHelperInner{
		private static final AuthenticationHelper instance= new AuthenticationHelper();
	}
	public synchronized static AuthenticationHelper getInstance(){
		return AuthenticationHelperInner.instance;
	}
	
	public void login(String username, String password){
		threadLocal.set(new UserInfo(username, password));
	}
	public void logout(){
		threadLocal.set(null);
	}
	public String getLoggedinUser(){
		return threadLocal!=null ? threadLocal.get().getUsername() : null;
	}
	public boolean isAuthenticated(){
		return threadLocal!=null ? (threadLocal.get().getUsername().equals("john") && threadLocal.get().getPassword().equals("welcome1")) ? true :false :false ;
	}
}
