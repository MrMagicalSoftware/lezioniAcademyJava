package lezione6Adecco;

import java.util.Scanner;

/**
 * 
 * Creare un programma
 * che prenda una sequenza di numeri
 * che termina quando si inserisce
 * il valore di -1
 * al termine della sequenz
 * il programma stampa quanti numeri
 * pari sono stati inseriti
 * 
 * Es :  2 5 10 12 -1 -------->3
 * 
 * 
 * @author mr
 *
 */

public class EsercizioCicli2 {

	public static void main(String[] args) {
		
		
		Scanner key = new Scanner(System.in);
	
		int contaPari = 0;
		int numeroUtente;
		
		do {
			
			System.out.println("Inserisci un numero");
			numeroUtente = key.nextInt();
			
			if(numeroUtente % 2 == 0)
				contaPari++;
			
			
			
		} while (numeroUtente != - 1);
		
		
		System.out.println("NUMERO DI PARI " + contaPari);
		
		key.close();
	}
	
}
