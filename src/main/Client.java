package main;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client extends Thread {

	public Socket socket;
	public String string;
	public static final int PORT = 12345;
	
	public Client(String msg) {
		this.string = msg;
	}

	public void run() {
		try {
			
			socket = new Socket("127.0.0.1",PORT);
			OutputStream outputStream = socket.getOutputStream();
			outputStream.write(string.getBytes("UTF-8"));
			outputStream.flush();
			outputStream.close();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
