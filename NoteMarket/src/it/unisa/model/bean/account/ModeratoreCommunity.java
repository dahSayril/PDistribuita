package it.unisa.model.bean.account;

import java.util.Date;

public class ModeratoreCommunity extends Moderatore {

	public ModeratoreCommunity() {
		super();
	}
	
	public ModeratoreCommunity(String email, String password, String nome, String cognome,
			Date dataDiNascita, byte[] fotoProfilo) {		
		super(email, password, nome, cognome, dataDiNascita, fotoProfilo);
	}
	
}
