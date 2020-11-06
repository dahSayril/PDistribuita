package it.unisa.model.bean.account;

import java.util.ArrayList;
import java.util.Date;

public class Tutor extends Account {

	public Tutor() {
		super();
		curriculum = "";
		specializzazioni = new ArrayList <Specializzazione> ();
	}
	
	public Tutor(String username, String password, String email, String nome, String cognome,
			Date dataDiNascita, byte[] fotoProfilo, String curriculum) {
		super(email, password, nome, cognome, dataDiNascita, fotoProfilo);
		this.curriculum = (curriculum == null) ? "" : curriculum;
		specializzazioni = new ArrayList <Specializzazione> ();
	}
	
	public String getCurriculum() { return curriculum; }
	
	public void setCurriculum(String curriculum) { this.curriculum = (curriculum == null) ? "" : curriculum; }
	
	public ArrayList <Specializzazione> getSpecializzazioni() { return specializzazioni; }
	
	public void setSpecializzazioni(ArrayList <Specializzazione> specializzazioni) { this.specializzazioni = specializzazioni; }
	
	public void aggiungiSpeicalizzione(Specializzazione specializzazione) {
		if(!specializzazioni.contains(specializzazione))
			specializzazioni.add(specializzazione);
	}
	
	public void rimuoviSpecializzazione(Specializzazione specializzazione) { specializzazioni.remove(specializzazione); }
	
	public String toString() {
		return super.toString() +
				"[curriculum=" + curriculum + ", specializzazioni" + specializzazioni + "]"; 
	}
	
	private String curriculum;
	private ArrayList <Specializzazione> specializzazioni;
	public enum Specializzazione {Italiano, Storia, Geografia, Matematica, Informatica, Scienze, Inglese, Diritto, Economia, Altro}
	
}
