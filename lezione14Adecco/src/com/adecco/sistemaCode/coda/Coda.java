package com.adecco.sistemaCode.coda;

import java.util.ArrayList;


import com.adecco.sistemaCode.persona.Persona;

public class Coda {

	
	private ArrayList<Persona> persone;
	
	public Coda() {
		this.persone = new ArrayList<>();
	}
	
	
	public ArrayList<Persona> getPersone() {
		return persone;
	}
	
	
	public void stampaPersona() {
		
		for(Persona p : persone)
			System.out.println(p);
		
	}
	
	public Persona restituisciProssimo() {
		
//		if(this.persone.size() <= 0)
//			return null;
		
		//se il vettore è vuoto
		if(this.persone.isEmpty())
			return null;
		
		Persona tmpPersona = this.persone.get(0);
		this.persone.remove(0);
		
		return tmpPersona;
		
	}
	
	
	public int contaPersoneInCoda() {
		return this.persone.size();
	}
	
	
	public void aggiungiPersona(Persona persona) {
		
		if(persona == null)
			return ; // ho terminato
		
		this.persone.add(persona);
		
	}
	
	
	
}
