package com.adecco.documento;

public class Documento {

	private String testo;
	
	
	
	
	public Documento() {
		this("example");
	}
	
	public Documento(String testo){
		setTesto(testo);
	}
	
	
	public double calcolaQualita() {
		
		return 1 / (double )  (1 + this.testo.length());
	}
	
	
	@Override
	public String toString() {
		return testo;
	}
	
	
	
	public String getTesto() {
		return testo;
	}
	
	
	
	public void setTesto(String testo) {
		
		if(testo != null)
			this.testo = testo;
	}
	
	
}
