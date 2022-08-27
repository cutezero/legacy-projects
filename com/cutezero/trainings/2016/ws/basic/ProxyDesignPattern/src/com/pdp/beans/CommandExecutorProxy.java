package com.pdp.beans;

public class CommandExecutorProxy implements CommandExecutor {
	private boolean isAdmin;
	private CommandExecutor executor;

	public CommandExecutorProxy(String username, String password) {
		if ("Srikanta".equals(username) && "panigrahy".equals(password))
			isAdmin = true;
		executor = new CommandExecutorImpl();
	}

	@Override
	public void runCommand(String command) throws Exception {
		if (isAdmin) {
			executor.runCommand(command);
		} else {
			if (command.trim().startsWith("rm")) {
				throw new Exception(
						"rm command is not allowed for non-admin users");
			} else {
				executor.runCommand(command);
			}
		}
	}

}
