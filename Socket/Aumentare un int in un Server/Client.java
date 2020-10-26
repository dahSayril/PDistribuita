package it.unisa.sum;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Logger;

public class Client {
	
	static Logger logger = Logger.getLogger("global");
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner i = new Scanner(System.in);
		
		try {
			
			@SuppressWarnings("resource")
			Socket socket = new Socket("localhost", Server.PORT);		
			ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
			out.flush();
			ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
			
			System.out.print("Inserisci il numero da aggiungere: ");
			int add = i.nextInt();
			out.writeInt(add);
			out.flush();
			System.out.print("Il totale è: ");
			System.out.println(in.readInt());
			
		} catch (Throwable t) {
			logger.severe("Lanciata Throwable: " + t.getMessage());
			t.printStackTrace();
		}
	}

}
