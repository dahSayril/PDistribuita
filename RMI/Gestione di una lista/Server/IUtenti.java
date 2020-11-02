package it.unisa.server;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.logging.Logger;

import it.unisa.interf.Utenti;

public class IUtenti extends UnicastRemoteObject implements Utenti {

	private static final long serialVersionUID = 1L;
	static Logger logger = Logger.getLogger("global");
	
	public IUtenti() throws RemoteException {
		super();
		list = new ArrayList <String> ();
	}
	
	public void add(String utente) throws RemoteException { if(!list.contains(utente)) list.add(utente); }
	
	public boolean delete(String utente) throws RemoteException { return list.remove(utente); }
	
	public ArrayList <String> list() throws RemoteException { return list; }
	
	private ArrayList <String> list;
	
	public static void main(String[] args) {
		
		try {
			
			logger.info("Creo l'oggetto ...");
			IUtenti obj = new IUtenti();
			logger.info("... Oggetto creato ...");
			logger.info("... Ne faccio il rebind ...");
			Naming.rebind("UtentiServer", obj);
			logger.info("... Rebind effettuato!");
			
		} catch (Exception e) {
			logger.severe("Lanciata eccezione: " + e.getMessage());
			e.printStackTrace();
		}
		
	}
	
}
