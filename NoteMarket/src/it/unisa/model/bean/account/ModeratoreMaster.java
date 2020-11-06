package it.unisa.model.bean.account;

import java.util.Date;

public class ModeratoreMaster extends Moderatore {

	public ModeratoreMaster() {
		super();
	}
	
	public ModeratoreMaster(String email, String password, String nome, String cognome,
			Date dataDiNascita, byte[] fotoProfilo) {		
		super(email, password, nome, cognome, dataDiNascita, fotoProfilo);
	}
	
}
