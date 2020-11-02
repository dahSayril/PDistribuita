package it.unisa.client;

import java.rmi.Naming;
import java.util.logging.Logger;

import it.unisa.interf.Utenti;

public class Client {
	
	static Logger logger = Logger.getLogger("global");
	
	public static void main(String[] args) {
		
		try {
			
			Utenti utenti = (Utenti) Naming.lookup("rmi://localhost/UtentiServer");
			
			if(args[0].equals("add"))
				utenti.add(args[1]);
			else if(args[0].equals("remove"))
				utenti.delete(args[1]);
			else if(args[0].equals("list")) {
				for(String i : utenti.list())
					System.out.println(i);
			}
			
		} catch (Exception e) {
			logger.severe("Lanciata eccezione: " + e.getMessage());
			e.printStackTrace();
		}
		
	}

}
