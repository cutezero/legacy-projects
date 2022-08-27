package com.socket.server;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSideSocket {

	public static void main(String[] args) {
		try {
			ServerSocket serverSocket= new ServerSocket(9180);
			Socket socket=serverSocket.accept();// Establishes Connection
			System.out.println("Connection has been established");
			DataInputStream inputStream= new DataInputStream(socket.getInputStream());
			String string=inputStream.readUTF();
			System.out.println("Message: "+string);
			serverSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
		}

	}

}
