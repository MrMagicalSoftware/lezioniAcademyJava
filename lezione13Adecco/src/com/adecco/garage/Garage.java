package com.adecco.garage;

import com.adecco.veicoli.VeicoloAMotore;

public class Garage {

	private VeicoloAMotore[] veicoli;
	
	public Garage() {
		this.veicoli = new VeicoloAMotore[15];
	}
	
	public Garage(int dim) {
	
		if(dim > 0 )
			this.veicoli = new VeicoloAMotore[dim];
		else
			this.veicoli = new VeicoloAMotore[15];

	}
	
	public void stampaSituazionePosti() {
		
		for(VeicoloAMotore v : this.veicoli)
			System.out.println(v);
		
	}
	
	
	public int inserisciVeicolo(VeicoloAMotore veicolo) {
		
		// se non trovo posto ritorno -1
		
		for (int i = 0; i < veicoli.length; i++) {
			
			// libero ??
			if(veicoli[i] == null) {
				veicoli[i]= veicolo;
				return i;
			}
		}
		
		return -1; // non ho trovo posto..... ..
			
	}
	
	
	public VeicoloAMotore estraiVeicolo(int pos) {
		
		if(pos >= this.veicoli.length ||  
			pos < 0  )
			return null;
		
		
		VeicoloAMotore tmpAMotore = this.veicoli[pos];
		this.veicoli[pos] = null;
		
		return tmpAMotore;
	}
	
	
	
	
	
	
	
}
