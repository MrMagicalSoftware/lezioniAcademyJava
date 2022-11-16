package com.adecco.test;

import com.adecco.documento.Documento;
import com.adecco.sistemaArchivio.Archivio;

public class Starter {

	public static void main(String[] args) {
		
		Archivio archivio = new Archivio();
		
		archivio.aggiungiDocumento( new Documento() );
		
		

	}

}
