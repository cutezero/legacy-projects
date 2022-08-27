package com.cfn;

import java.util.Scanner;

public class Main {
	public static void main(String...args) throws Exception{
		Scanner s=  new Scanner(System.in);
		System.out.println("Enter username : ");
		String username=s.nextLine();
		System.out.println("Enter password : ");
		String password=s.nextLine();
		ICommandExecutor ce= CommandExecutorFactory.getInstance(username, password);
		System.out.println("Enter Your Command: ");
		String cmd=s.nextLine();
		ce.runCommand(cmd);
	}
}
