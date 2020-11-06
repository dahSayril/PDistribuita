package it.unisa.model.bean.account;

import java.util.Date;

public abstract class Account {

	public Account() {
		password = "";
		email = "";
		nome = "";
		cognome = "";
		dataDiNascita = null;
		fotoProfilo = null;
		stato = Stato.daVerificare;
	}
	
	public Account(String email, String password, String nome, String cognome,
			Date dataDiNascita, byte[] fotoProfilo) {
		this.password = (password == null) ? "" : password;
		this.email = (email == null) ? "" : email;
		this.nome = (nome == null) ? "" : nome;
		this.cognome = (cognome == null) ? "" : cognome;
		this.dataDiNascita = dataDiNascita;
		this.fotoProfilo = fotoProfilo;
		this.stato = Stato.daVerificare;
	}
	
	public String getPassword() { return password; }
	
	public void setPassword(String password) { this.password = (password == null) ? "" : password; }
	
	public String getEmail() { return email; }
	
	public void setEmail(String email) { this.email = (email == null) ? "" : email; }
	
	public String getNome() { return nome; }
	
	public void setNome(String nome) { this.nome = (nome == null) ? "" : nome; }
	
	public String getCognome() { return cognome; }
	
	public void setCognome(String cognome) { this.cognome = (cognome == null) ? "" : cognome; }
	
	public Date getDataDiNascita() { return dataDiNascita; }
	
	public void setDataDiNascita(Date dataDiNascita) { this.dataDiNascita = dataDiNascita; }
	
	public byte[] getFotoProfilo() { return fotoProfilo; }
	
	public void setFotoProfilo(byte[] fotoProfilo) { this.fotoProfilo = fotoProfilo; }
	
	public Stato getStato() { return this.stato; }
	
	public void setStato(Stato stato) { this.stato = stato; }
	
	public boolean isVerificato() { return stato == Stato.verificato; }
	
	public boolean isDaVerificare() { return stato == Stato.daVerificare; }
	
	public boolean isBannato() { return stato == Stato.bannato; }
	
	public String toString() {
		return getClass().getCanonicalName() + "[email=" + email + "password=" + password +
				", nome=" + nome + ", cognome=" + cognome + ", dataDiNascita=" + dataDiNascita +
				", fotoProfilo=" + fotoProfilo + ", stato=" + stato + "]";
	}
	
	public boolean equals(Object object) {
		if(object == null) return false;
		if(object.getClass() != getClass()) return false;
		Account other = (Account) object;
		return other.password.equals(password) && other.email.equals(email) &&
				other.nome.equals(nome) && other.cognome.equals(cognome) && other.dataDiNascita.equals(dataDiNascita) &&
				other.fotoProfilo.equals(fotoProfilo) && other.stato.equals(stato);
	}
	
	private String email, password, nome, cognome;
	private Date dataDiNascita;
	private byte[] fotoProfilo;
	private Stato stato;
	public static enum Stato {verificato, daVerificare, bannato};
	
}
