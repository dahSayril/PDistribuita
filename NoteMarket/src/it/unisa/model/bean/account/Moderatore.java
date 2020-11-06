package it.unisa.model.bean.account;

import java.util.Date;

public class Moderatore extends Account {

	public Moderatore() {
		super();
	}
	
	public Moderatore(String email, String password, String nome, String cognome,
			Date dataDiNascita, byte[] fotoProfilo) {		
		super(email, password, nome, cognome, dataDiNascita, fotoProfilo);
	}
	
}
