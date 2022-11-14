package com.adecco.sistemaCode.coda;

import com.adecco.sistemaCode.persona.Persona;

public class CodaConPriorita extends Coda {

	
	public CodaConPriorita() {
		super();
	}
	
	
	@Override
	public Persona restituisciProssimo() {
		
		Persona personaMaggiore = cercaPersonaMaggioreDi60();
		
		if(personaMaggiore != null) {
			super.getPersone().remove(personaMaggiore);
			return personaMaggiore;
		}
		else {
			return super.restituisciProssimo();
		}
			
		
	}
	
	
	/**
	 * 
	 * mi restituisce la persona
	 * con >= 60 oppure se non trova niente
	 * mi retuisce null.
	 * 
	 * @return
	 */
	private Persona cercaPersonaMaggioreDi60() {
		
		for(int i = 0 ; i < super.getPersone().size() ; i++) {
			
			if(super.getPersone().get(i).getEta() >= 60)
				return super.getPersone().get(i);
			
		}
		
		return null;
		
		
	}
	
	
	
	
	
	
}
