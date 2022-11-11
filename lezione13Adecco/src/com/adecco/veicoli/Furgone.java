package com.adecco.veicoli;

public class Furgone extends VeicoloAMotore{

	
	private int capacitaCarico;
	
	
	
	
	
	
	
	public Furgone() {
		super();
		setCapacitaCarico(1000);
	}

	public Furgone(int annoImmatricolazione, int cilindrata, String marca,
			String tipoAlimentazione,int capacitaCarico) {
		super(annoImmatricolazione, cilindrata, 
				marca, tipoAlimentazione );
		
		setCapacitaCarico(capacitaCarico);
	}

	@Override
	public String toString() {
		
		return "FURGONE " +super.toString() + "carico max " + this.capacitaCarico;
	}
	
	public int getCapacitaCarico() {
		return capacitaCarico;
	}
	
	public void setCapacitaCarico(int capacitaCarico) {
		this.capacitaCarico = capacitaCarico <= 1000 ? capacitaCarico : 1000;
	}
	
	
	
}
