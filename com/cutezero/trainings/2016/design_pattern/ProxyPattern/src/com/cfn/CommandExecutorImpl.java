package com.cfn;

import java.io.IOException;

public class CommandExecutorImpl implements ICommandExecutor {

	@Override
	public void runCommand(String cmd) throws IOException {
		
		Runtime runtime=Runtime.getRuntime();
		runtime.exec(cmd);
		System.out.println("your command "+cmd+" executed");
		

	}

}
