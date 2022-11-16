package com.adecco.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.adecco.documento.Documento;
import com.adecco.documento.DocumentoPrioritario;
import com.adecco.sistemaArchivio.Archivio;

public class TestArchivio {

	@Test
	public void test() {
		
		
		Archivio archivio = new Archivio();
		
		Documento documento1 =new Documento("dsaadsada");
		Documento documento2 =new Documento("ciao");
		Documento documento3 =new Documento("miao");
		DocumentoPrioritario documento4 = 
				new DocumentoPrioritario("aaaa", 3);

		
		archivio.aggiungiDocumento(documento1);
		archivio.aggiungiDocumento(documento2);
		archivio.aggiungiDocumento(documento3);
		archivio.aggiungiDocumento(documento4);

		
		
		
	
		assertTrue(4 == archivio.takeSizeOfArray());
		
		assertEquals(archivio.trovaMigliore(), documento4);
		assertTrue(3 == archivio.takeSizeOfArray());

		
		assertEquals(archivio.trovaMigliore(), documento2);
		assertEquals(archivio.trovaMigliore(), documento3);
		assertEquals(archivio.trovaMigliore(), documento1);

	
		assertTrue(0 == archivio.takeSizeOfArray());

		
	}

}
