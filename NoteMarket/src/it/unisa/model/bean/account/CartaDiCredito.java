package it.unisa.model.bean.account;

import java.util.Date;

public class CartaDiCredito {

	public CartaDiCredito() {
		nomeIntestatario = "";
		numero = "";
		dataDiScadenza = null;
	}
	
	public CartaDiCredito(String nomeIntestatario, String numero, Date dataDiScadenza) {
		this.nomeIntestatario = (nomeIntestatario == null) ? "" : nomeIntestatario;
		this.numero = (numero == null) ? "" : numero;
		this.dataDiScadenza = dataDiScadenza;
	}
	
	public String getNomeIntestatario() { return nomeIntestatario; }
	
	public void setNomeIntestatario(String nomeIntestaraio) { this.nomeIntestatario = (nomeIntestatario == null) ? "" : nomeIntestatario; }
	
	public String getNumero() { return numero; }
	
	public void setNumero(String numero) { this.numero = (numero == null) ? "" : numero; }
	
	public Date getDataDiScadenza() { return dataDiScadenza; }
	
	public void setDataDiScadenza(Date dataDiScadenza) { this.dataDiScadenza = dataDiScadenza; }
	
	public String toString() {
		return getClass().getCanonicalName() + "[nomeIntestatario=" + nomeIntestatario +
				", numero=" + numero + ", dataDiScadenza=" + dataDiScadenza + "]";
	}
	
	public boolean equals(Object object) {
		if(object == null) return false;
		if(object.getClass() != getClass()) return false;
		CartaDiCredito other = (CartaDiCredito) object;
		return other.nomeIntestatario.equals(nomeIntestatario) && other.numero.equals(numero) &&
				other.dataDiScadenza.equals(dataDiScadenza);
	}
	
	private String nomeIntestatario, numero;
	private Date dataDiScadenza;
	
}
