package com.adecco.veicoli;

public class Automobile extends VeicoloAMotore {

	private int numeroPorte;
	
	
	public void setNumeroPorte(int numeroPorte) {
		this.numeroPorte = 
				numeroPorte == 5  || numeroPorte == 3 ? numeroPorte : 5; 
	
		
		if(numeroPorte == 5 || numeroPorte == 3)
			this.numeroPorte = numeroPorte;
		else
			this.numeroPorte = 5;
	
	}
	
	public int getNumeroPorte() {
		return numeroPorte;
	}
	
}
