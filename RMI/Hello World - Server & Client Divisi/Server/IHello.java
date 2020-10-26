package it.unisa;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Logger;

public class IHello extends UnicastRemoteObject implements Hello {

	private static final long serialVersionUID = 1L;
	static Logger logger = Logger.getLogger("global");
	
	public IHello() throws RemoteException {
		super();
	}
	
	public String dimmiQualcosa(String daChi) throws RemoteException {
		logger.info("Sto salutando: " + daChi);
		return "Ciao!";
	}
	
	public static void main(String[] args) {
		
		try {
			
			logger.info("Creo l'oggetto remoto...");
			IHello obj = new IHello();
			logger.info("... oggetto creato!");
			logger.info("... ne faccio il rebind...");
			Naming.rebind("HelloServer", obj);
			logger.info("Rebind effettuato con successo!");
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
