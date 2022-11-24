package exampleInterface;

import java.util.Iterator;

public class FunzioniExample {

	
	/***
	 * 
	 * FUNZIONI :
	 * 
	 * 
	 * 1- CREARE UNA FUNZIONE
	 * 	  CHE PRENDA IN INPUT
	 * 	  2 NUMERI E RITORNI IL MAGGIORE
	
	 * @param args
	 */
	
	
	public int maggiore(int numero1 , int numero2) {
		
		return numero1 > numero2 ? numero1 : numero2;
	}
	
	
	/**
	 * 
	 * FUNZIONE :
	 *  CREARE UNA FUNZIONE CHE PRENDA
	 *  IN INPUT UN VETTORE DI BOOLEAN
	 *  E RITORNA TRUE SE IL VETTORE
	 *  E' COMPOSTO DA TUTTI TRUE
	 *  
	 *  
	 * 
	 * 
	 * @param args
	 */
	
	public boolean isAlltrue(boolean[] vett) {
		for(boolean elemento : vett)
			if(elemento == false)
				return false;
		
		
		return true;
	}
	
	
	//dato un vettore di interi
	//ritornare la sommatoria dei 
	//soli elementi pari [ 10 , 1 , 2 ] -----> 12
	
	
	public int sommaNumeri(int[] arr) {
		
		int somma = 0;
		
		for(int elemento : arr)
			if(elemento % 2 == 0 )
				somma += elemento;
		
		return somma;
	}
	
	
	
	
	public static void main(String[] args) {
	
		
		
	}
	
	
	
}
