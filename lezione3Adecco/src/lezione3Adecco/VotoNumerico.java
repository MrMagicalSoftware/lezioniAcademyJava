package lezione3Adecco;

import java.util.Scanner;

/**
 * Scrivere un programma 
 * che legge un voto e dice se insufficiente 
 * o sufficiente e se è insufficiente distingue tra gravemente 
 * insufficiente (minore o uguale a 4)
 *  o insufficiente ovvero compreso tra 4 (escluso) e 6 (escluso).
 * 
 * 
 * 
 * @author mr
 *
 */



public class VotoNumerico {

	
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		System.out.println("inserisci");
		double myVoto = key.nextDouble();
		
		
		if(myVoto >= 6 ) {
			System.out.println("niente botte dalla mamma :) ");
		}
		else if(myVoto >= 4) {
			System.out.println(" ni ni ");
		}else {
			System.out.println("gravemente insu");
		}
		
		
		
		/*
		
		if(myVoto >= 6 ) {
			
		}
		
		
		if(myVoto >= 4 && myVoto <= 5) {
			
		}
		
		if(myVoto < 4 ) {
			
		}
		
		*/ 
		
		
		
		key.close();
	}
	
}
