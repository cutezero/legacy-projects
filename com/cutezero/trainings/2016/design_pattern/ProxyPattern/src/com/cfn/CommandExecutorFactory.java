package com.cfn;

public class CommandExecutorFactory {
	public static ICommandExecutor getInstance(String username, String password){
		return new CommandExecutorProxy(username, password);
	}

}
