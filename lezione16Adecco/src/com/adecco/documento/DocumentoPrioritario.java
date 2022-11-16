package com.adecco.documento;

public class DocumentoPrioritario extends Documento{

	
	
	private int incremento;
	
	public DocumentoPrioritario() {
		super();
		setIncremento(0);
	}
	
	public DocumentoPrioritario(String testo , int incremento) {
		super(testo);
		setIncremento(incremento);
	}
	
	
	// to do ...
	public void setIncremento(int incremento) {
		this.incremento = incremento;
	}
	

	public int getIncremento() {
		return incremento;
	}
	
	@Override
	public double calcolaQualita() {
		
		// 1 / (double )  (1 + this.testo.length()) + this.incremento;
		return super.calcolaQualita() + this.incremento;
	}
	
	
	
	
}
