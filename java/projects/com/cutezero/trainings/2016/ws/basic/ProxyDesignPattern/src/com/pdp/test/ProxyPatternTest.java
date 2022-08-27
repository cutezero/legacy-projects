package com.pdp.test;

import com.pdp.beans.CommandExecutor;
import com.pdp.beans.CommandExecutorProxy;

public class ProxyPatternTest {

	public static void main(String[] args) {
		CommandExecutor executor=new CommandExecutorProxy("Srikanta", "wrong password");
//		CommandExecutor executor=new CommandExecutorProxy("Srikanta", "panigrahy");
		try {
//			executor.runCommand("ls -ltr");
			executor.runCommand("ps -ef");
			executor.runCommand(" rm -rf abc.pdf");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
