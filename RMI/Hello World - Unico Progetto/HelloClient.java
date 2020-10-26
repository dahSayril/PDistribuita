package it.unisa.helloworld;

import java.rmi.Naming;
import java.util.logging.Logger;

public class HelloClient {

	static Logger logger = Logger.getLogger("global");
	
	public static void main(String[] args) {
		
		try {
			
			logger.info("Sto cercando l'oggtto remoto...");
			Hello obj = (Hello) Naming.lookup("rmi://localhost/HelloServer");
			
			logger.info("... Trovato! Invoco metodo...");
			String risultato = obj.dimmiQualcosa("Pippo");
			
			System.out.println("Ricevuto: " + risultato);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
