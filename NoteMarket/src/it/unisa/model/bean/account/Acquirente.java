package it.unisa.model.bean.account;

import java.util.ArrayList;
import java.util.Date;

public class Acquirente extends Account {

	public Acquirente() {
		super();
		carteDiCredito = new ArrayList <CartaDiCredito> ();
	}
	
	public Acquirente(String email, String password, String nome, String cognome,
			Date dataDiNascita, byte[] fotoProfilo) {		
		super(email, password, nome, cognome, dataDiNascita, fotoProfilo);
		carteDiCredito = new ArrayList <CartaDiCredito> ();
	}
	
	public ArrayList <CartaDiCredito> getCarteDiCredito() { return carteDiCredito; }
	
	public void setCarteDiCredito(ArrayList <CartaDiCredito> carteDiCredito) { carteDiCredito = new ArrayList <CartaDiCredito> (); }
	
	public void aggiungiCartaDiCredito(CartaDiCredito cartaDiCredito) {
		if(!carteDiCredito.contains(cartaDiCredito))
			carteDiCredito.add(cartaDiCredito);
	}
	
	public void rimuoviCartaDiCredito(CartaDiCredito cartaDiCredito) { carteDiCredito.remove(cartaDiCredito); }
	
	private ArrayList <CartaDiCredito> carteDiCredito;
	
}
