package com.adecco.sistemaCode.persona;

public class Persona {

	
	private String cognome;
	private int eta;
	
	
	public Persona() {
		this("rossi", 20);
	}
	
	public Persona(String cognome ,int eta ) {
		setCognome(cognome);
		setEta(eta);
	}
	
	
	@Override
	public String toString() {
		return this.cognome + " " + this.eta;
	}
	

	
	public String getCognome() {
		return cognome;
	}
	
	public int getEta() {
		return eta;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public void setEta(int eta) {
		this.eta = eta;
	}
	
	
	
	
	
}
