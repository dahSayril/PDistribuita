package it.unisa;

import java.rmi.Naming;
import java.util.Scanner;
import java.util.logging.Logger;

public class HelloClient {

	static Logger logger = Logger.getLogger("global");
	
	public static void main(String[] args) {
		
		try {
			
			logger.info("Ottengo il riferimento remoto");
			Hello obj = (Hello) Naming.lookup("rmi://localhost/HelloServer");			
			logger.info("Riferimento ricevuto");
			
			System.out.println("Chi è a salutare?");
			Scanner in = new Scanner(System.in);
			
			System.out.println(obj.dimmiQualcosa(in.nextLine()));	
			in.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
