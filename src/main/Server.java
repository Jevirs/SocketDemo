package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread {

	public static final int PORT = 12345;
	
	public void run() {
		try {
			ServerSocket server = new ServerSocket(PORT);
			while (true) {
				
				Socket socket = server.accept();
				
				InputStream is = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);

				String line = null;
				StringBuilder sb = new StringBuilder();
				while ((line = br.readLine()) != null) {
					sb.append(line);
				}

				br.close();
				isr.close();
				is.close();
				
				System.out.print("Client:"+sb);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
