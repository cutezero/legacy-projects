package com.declarative.aspectj.before.helper;

public class AuthenticationHelper {

	private ThreadLocal<UserInfo> threadLocal;
	private AuthenticationHelper() {
		threadLocal=new ThreadLocal<>(); 
	}

	private static class AuthenticationHelperInner{
		private static final AuthenticationHelper instance= new AuthenticationHelper();
	}
	
	public static AuthenticationHelper getInstance(){
		return AuthenticationHelperInner.instance;
	}
	
	public void login(String username, String password){
		threadLocal.set(new UserInfo(username, password));
	}
	
	public void logout(){
		threadLocal.set(null);
	}
	
	public String getLoggedInUser(){
		return threadLocal.get() != null ? threadLocal.get().getUsername() : null;
	}
	
	public boolean isAuthenticated(){
		return threadLocal.get() != null ? (threadLocal.get().getUsername().equals("john") && threadLocal.get().getPassword().equals("welcome1") ? true :false) : false;
	}
}
