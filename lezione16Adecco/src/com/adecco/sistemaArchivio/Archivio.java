package com.adecco.sistemaArchivio;

import java.util.ArrayList;

import com.adecco.documento.Documento;

public class Archivio {

	private ArrayList<Documento> documenti;
	
	
	public Archivio() {
		this.documenti = new ArrayList<>();
	}
	
	
	public int takeSizeOfArray() {
		return this.documenti.size();
	}
	
	
	
	public void aggiungiDocumento(Documento documento) {
		this.documenti.add(documento);
	}
	
	
	public Documento trovaMigliore() {
		
		if(this.documenti.isEmpty())
			return null;
		
	
		Documento documentoMax = this.documenti.get(0);
		
		/*
		for(int i = 0 ; i < this.documenti.size(); i++) {
			
			if(this.documenti.get(i).calcolaQualita()
					> documentoMax.calcolaQualita()) {
				documentoMax = this.documenti.get(i);
			}
			
		}*/
		
		
		for(Documento doc : this.documenti) {
			if(doc.calcolaQualita() > documentoMax.calcolaQualita())
				documentoMax = doc;
		}
		
		Documento tmpDocumento = documentoMax;
		
		this.documenti.remove(documentoMax);
		
		
		return tmpDocumento;
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
