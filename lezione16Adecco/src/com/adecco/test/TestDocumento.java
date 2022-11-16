package com.adecco.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.adecco.documento.Documento;
import com.adecco.documento.DocumentoPrioritario;

public class TestDocumento {

	@Test
	public void test() {
		
		Documento documento = new Documento("A");
		
		// 1 / 1 + 0 --------> 1
		
		double qualita = documento.calcolaQualita();
		System.out.println("RIS " + qualita);
		
		assertTrue( qualita == 0.5);
		
		
		
	}
	
	
	@Test
	public void testDocumentoPrioritario() {
		
		DocumentoPrioritario documentoPrioritario
		= new DocumentoPrioritario("a", 1);
		
		// 0.5 + 1
		
		
		assertTrue(documentoPrioritario.calcolaQualita()
				== 1.5);
		
		
		documentoPrioritario.setIncremento(2);
		
		assertTrue(documentoPrioritario.calcolaQualita()
				== 2.5);
		
		
	}
	
	
	
	

}
