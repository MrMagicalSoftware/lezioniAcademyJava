package com.adecco.sistemaCode.test;

import static org.junit.Assert.*;

import com.adecco.sistemaCode.coda.Coda;
import com.adecco.sistemaCode.coda.CodaConPriorita;
import com.adecco.sistemaCode.persona.Persona;

public class Test {

	@org.junit.Test
	public void test() {
		assertTrue(2 == 1 + 1);
	}

	@org.junit.Test
	public void pluto() {
		assertFalse(2 == 1 + 3);
	}
	
	@org.junit.Test
	public void testPersona() {
		
		Persona persona =  new Persona("rossi", 18);
		
		
		assertEquals(persona.getCognome(), "rossi");
		assertEquals(persona.getEta(), 18);

		assertFalse(persona.getEta() > 30);
		
	}
	
	@org.junit.Test
	public void testCoda() {
	
		Coda coda = new Coda();
		assertNotNull(coda);
		
		assertTrue(coda.contaPersoneInCoda() == 0);
	
		Persona p1 = new Persona("verdi", 20);
		Persona p2 = new Persona("giallini", 20);

		coda.aggiungiPersona(p1);
		assertTrue(coda.contaPersoneInCoda() == 1);
		assertEquals(coda.getPersone().get(0),p1);
		
		assertNotEquals(coda.getPersone().get(0),p2);

		coda.aggiungiPersona(p2);
		assertEquals(coda.getPersone().get(1),p2);

		
		
		assertEquals(coda.restituisciProssimo(),p1);
		assertEquals(coda.restituisciProssimo(),p2);
		assertTrue(coda.contaPersoneInCoda() == 0);

	
	}
	
	
	@org.junit.Test
	public void testCodaConPriorita() {
		
		
		System.out.println("OK INIZIO TEST");
		
		
		CodaConPriorita codaConPriorita =
				new CodaConPriorita();
		
		Persona p1 = new Persona("verdi", 20);
		Persona p2 = new Persona("giallini", 20);
		Persona p3 = new Persona("gg", 20);
		Persona p4 = new Persona("bianchi", 80);
		
		System.out.println("stampo persone");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);

		
		codaConPriorita.aggiungiPersona(p1);
		codaConPriorita.aggiungiPersona(p2);
		codaConPriorita.aggiungiPersona(p3);
		codaConPriorita.aggiungiPersona(p4);

		
		assertEquals(codaConPriorita.restituisciProssimo(), p4);
		assertEquals(codaConPriorita.restituisciProssimo(), p1);
		assertEquals(codaConPriorita.restituisciProssimo(), p2);
		assertEquals(codaConPriorita.restituisciProssimo(), p3);


		
	}
	
	
	
	
	
	
	
}
