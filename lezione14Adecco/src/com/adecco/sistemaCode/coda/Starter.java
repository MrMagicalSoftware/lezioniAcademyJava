package com.adecco.sistemaCode.coda;

import java.util.Random;

import com.adecco.sistemaCode.persona.Persona;

public class Starter {

	public static void main(String[] args) {
		
		Random random = new Random();
		Coda coda = new Coda();
		
		for(int i = 0 ; i <10 ; i++) {
			
			coda.aggiungiPersona(new Persona("Cognome " + i,  random.nextInt(10, 70) ));
		}
		
		System.out.println(coda.contaPersoneInCoda());
		
		System.out.println("###########################");
		
		
		
		coda.stampaPersona();
		
		System.out.println("");
		
		System.out.println("Persona servita  . .. .. . .. " + coda.restituisciProssimo());
		System.out.println("Persona servita  . .. .. . .. " + coda.restituisciProssimo());
		System.out.println("Persona servita  . .. .. . .. " + coda.restituisciProssimo());
		System.out.println("Persona servita  . .. .. . .. " + coda.restituisciProssimo());

		
		System.out.println();
		
		
		coda.stampaPersona();

		
		for(int i = 0  ; i < 10 ; i++)
			System.out.println("Persona servita  . .. .. . .. " + coda.restituisciProssimo());

		
		
		System.out.println();
		
		
		coda.stampaPersona();

		
		
		
	}
	
}
