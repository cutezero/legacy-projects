package com.cfn;

public class CommandExecutorProxy implements ICommandExecutor{
	private boolean isAdmin;
	private ICommandExecutor executor;
	public CommandExecutorProxy(String username, String password){
		if (username.equals("Sekhar")&& password.equals("faculty"))
		{
			isAdmin=true;
		}
		executor= new CommandExecutorImpl();
	}//end of Constructor
	public void runCommand(String cmd) throws Exception{
		if(isAdmin)
		{
			executor.runCommand(cmd);
		}
		else
		{
			if (cmd.startsWith("ping"))
			{
				throw new Exception("Ping is not allowed for Non-Admin users");
			}
			else
			{
				executor.runCommand(cmd);
			}
		}//end of 1st else
	}//end of runCommand()
}//end of class
