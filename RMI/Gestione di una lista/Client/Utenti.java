package it.unisa.interf;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface Utenti extends Remote {

	void add(String utente) throws RemoteException;
	
	boolean delete(String utente) throws RemoteException;
	
	ArrayList <String> list() throws RemoteException;
	
}
