package it.unisa.helloworld;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Logger;

public class HelloImpl extends UnicastRemoteObject implements Hello {

	private static final long serialVersionUID = 1L;
	
	static Logger logger = Logger.getLogger("global");
	
	public HelloImpl() throws RemoteException {
		
	}

	public String dimmiQualcosa(String daChi) throws RemoteException {
		logger.info("Sto salutando: " + daChi);
		return "Ciao!";
	}
	
	public static void main(String[] args) {
						
		try {
			logger.info("Creo l'oggetto remoto...");
			HelloImpl obj = new HelloImpl();
			logger.info("... ne effutto il rebind...");
			Naming.rebind("HelloServer", obj);
			logger.info("... Pronto!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
