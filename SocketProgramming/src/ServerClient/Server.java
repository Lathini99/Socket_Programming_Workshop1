package ServerClient;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.PrintWriter;

public class Server {
	
	static int port = 6600;

	public static void main(String[] args) throws IOException {
		System.out.println("\t\t Simple Socket Serever");
		System.out.println("\t\t==================\n\n");
		
		ServerSocket serversocket = new ServerSocket(port);
		try {
			while(true) {
				Socket socket = serversocket.accept();
				System.out.println("Client is connected......\n\n");
		
				try {
					PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
					out.println("Welcome to Socket Programming");
				} finally {
					socket.close();
				}
			}
		}finally {
				serversocket.close();
			}
		
			

	}

}
