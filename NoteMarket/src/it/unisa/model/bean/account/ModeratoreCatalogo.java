package it.unisa.model.bean.account;

import java.util.Date;

public class ModeratoreCatalogo extends Moderatore {

	public ModeratoreCatalogo() {
		super();
		numeroApprovazioni = 0;
	}
	
	public ModeratoreCatalogo(String email, String password, String nome, String cognome,
			Date dataDiNascita, byte[] fotoProfilo) {		
		super(email, password, nome, cognome, dataDiNascita, fotoProfilo);
		numeroApprovazioni = 0;
	}
	
	public int getNumeroApprovazioni() { return numeroApprovazioni; }
	
	public void setNumeroApprovazioni(int numeroApprovazioni) { this.numeroApprovazioni = numeroApprovazioni; }
	
	public void incrementaNumeroApprovazioni() { numeroApprovazioni++; }
	
	public String toString() {
		return super.toString() + 
				"[numeroApprovazioni=" + numeroApprovazioni + "]";
	}
	
	private int numeroApprovazioni;
	
}
