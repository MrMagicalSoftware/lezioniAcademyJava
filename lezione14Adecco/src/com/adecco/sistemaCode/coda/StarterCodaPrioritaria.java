package com.adecco.sistemaCode.coda;

import com.adecco.sistemaCode.persona.Persona;

public class StarterCodaPrioritaria {

	public static void main(String[] args) {
		
		
		CodaConPriorita codaConPriorita = new CodaConPriorita();
		
		
		codaConPriorita.aggiungiPersona(new Persona("mario", 30));
		codaConPriorita.aggiungiPersona(new Persona("luigi", 32));
		codaConPriorita.aggiungiPersona(new Persona("Allegro Pensionato", 70));

		
		System.out.println("Prossimo ----> " +codaConPriorita.restituisciProssimo());
		System.out.println("Prossimo ----> " +codaConPriorita.restituisciProssimo());
		System.out.println("Prossimo ----> " +codaConPriorita.restituisciProssimo());
		System.out.println("Prossimo ----> " +codaConPriorita.restituisciProssimo());


	}

}
