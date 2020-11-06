package it.unisa.model.bean.account;

import java.util.Date;

public class Helper extends Moderatore {

	public Helper() {
		super();
		numeroTicket = 0;
	}
	
	public Helper(String email, String password, String nome, String cognome,
			Date dataDiNascita, byte[] fotoProfilo) {		
		super(email, password, nome, cognome, dataDiNascita, fotoProfilo);
		numeroTicket = 0;
	}
	
	public int getNumeroTicket() { return numeroTicket; }
	
	public void setNumeroTicket(int numeroTicket) { this.numeroTicket = numeroTicket; }
	
	public void incrementaNumeroApprovazioni() { numeroTicket++; }
	
	public String toString() {
		return super.toString() + 
				"[numeroTicket=" + numeroTicket + "]";
	}
	
	private int numeroTicket;
	
}
