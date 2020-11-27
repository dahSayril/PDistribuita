package it.unisa.sum;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Logger;

public class Server extends Thread {

	static Logger logger = Logger.getLogger("global");
	
	public static void main(String[] args) {
		
		try {
			
			
			@SuppressWarnings("resource")
			ServerSocket server = new ServerSocket(PORT);
			Socket socket = null;
			ObjectOutputStream out;
			ObjectInputStream in;			
			
			logger.severe("In attessa di con...");
			
			while(true) {
				
				socket = server.accept();
				logger.severe("Connessione stabilita!");
				
				out = new ObjectOutputStream(socket.getOutputStream());
				out.flush();
				in = new ObjectInputStream(socket.getInputStream());
				
				new Server(in, out).start();
				
			}
			
			
		} catch (EOFException e) {
			logger.severe("Connessione chiusa: " + e.getMessage());
			e.printStackTrace();
		
		} catch (Throwable t) {
			logger.severe("Lanciata Throwable: " + t.getMessage());
			t.printStackTrace();
		}
		
	}
	
	public Server(ObjectInputStream in, ObjectOutputStream out) {
		this.in = in; this.out = out; 
	}
		
	public void run() {
				
		try {
			int add = in.readInt();
			synchronized(Class.class) { value += add; }
		} catch (IOException e) {
			logger.severe("Probelmi con la lettura dell'intero: " + e.getMessage());
			e.printStackTrace();
		} try {
			out.writeInt(value);
			out.flush();
		} catch (IOException e) {
			logger.severe("Probelmi con la scrittura dell'intero: " + e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	public static int value = 0;
	public static final int PORT = 9000;
	private ObjectInputStream in;
	private ObjectOutputStream out;
	
}
