package it.unisa.model.dao;

import java.sql.SQLException;
import java.util.Collection;

public interface DataAccessObject <T> {
	
	T doRetrieveByKey(String code) throws SQLException;
	// Restituisce un oggetto istanza di MyData i cui dati sono letti dal database

	Collection <T> doRetriveAll(String order) throws SQLException;
	// Restituisce tutta la collezione di oggetti istanza della classe
	
	void doSave(T parameter) throws SQLException;
	// Salva i dati dell'oggetto corrente nel database
	
	void doUpdate(T parameter) throws SQLException;
	// Salva gli aggiornamento dell'oggento corrente nel database
	
	void doDelete(T parameter) throws SQLException;
	// Cancella dal database i dati dell'oggetto corrente
	
}