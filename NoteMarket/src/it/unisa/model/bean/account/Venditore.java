package it.unisa.model.bean.account;

import java.util.Date;

public class Venditore extends Account {

	public Venditore() {
		super();
		this.saldo = 0;
	}
	
	public Venditore(String email, String password, String nome, String cognome,
			Date dataDiNascita, byte[] fotoProfilo) {
		super(email, password, nome, cognome, dataDiNascita, fotoProfilo);
	}
	
	public double getSaldo() { return saldo; }
	
	public void setSaldo(double saldo) { this.saldo = saldo; }
	
	public void aumentaSaldo(double diQuanto) { saldo += diQuanto; }
	
	public void diminuisciSaldo(double diQuanto) { saldo -= diQuanto; }
	
	public String toString() {
		return super.toString() + 
				"[saldo=" + saldo + "]";
	}
	
	private double saldo;
	
}
