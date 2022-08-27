package com.socket.client;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientSocket {

	public static void main(String[] args) {
		try {
			Socket socket= new Socket("127.0.0.1",9180);
			DataOutputStream outputStream=new DataOutputStream(socket.getOutputStream());
			outputStream.writeUTF("May be Hello is enough");
			outputStream.flush();
			outputStream.close();
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
		}

	}

}
