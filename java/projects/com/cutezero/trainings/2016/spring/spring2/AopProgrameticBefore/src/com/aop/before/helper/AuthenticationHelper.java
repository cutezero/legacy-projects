package com.aop.before.helper;

public class AuthenticationHelper {

	private ThreadLocal<LoginInfo> threadLocal;

	private AuthenticationHelper() {
		threadLocal = new ThreadLocal<LoginInfo>();
	}

	private static class AuthenticationHelperInner {
		private static final AuthenticationHelper instance = new AuthenticationHelper();
	}

	public static AuthenticationHelper getInstance() {
		return AuthenticationHelperInner.instance;
	}

	public void login(String username, String password) {
		threadLocal.set(new LoginInfo(username, password));
	}

	public void logout() {
		threadLocal.set(null);
	}

	public boolean authenticate() {
		if (threadLocal.get().getUsername().equals("Srikanta") && threadLocal.get().getPassword().equals("Panigrahy"))
			return true;
		return false;
	}

	public String getLoggedInUser() {
		try{
		if (!threadLocal.get().equals(null))
			return threadLocal.get().getUsername();
		}catch(Exception e){
			System.err.println(" Null has reached \n ThreadLocal : "+threadLocal);
		}
		return null;
	}
}
