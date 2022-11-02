package lezione6Adecco;

import java.util.Scanner;

/**
 * 
 * Creare un programma che chieda in input
 *    una serie di numeri fino a che non si inserisce
 *    un valore negativo
 *    ( NOTA SI CHIAMANO CICLI INDEFINITI )
 *    
 *    10 2 8  .. . . . .. . .. . -1
 * 
 * 
 * @author mr
 *
 */


public class EsempioCicliIndefiniti {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		
		/*
		System.out.println("Inserisci un numero");
		int numeroUtente = key.nextInt();
		
		while(numeroUtente >= 0 ) {
			
			System.out.println("inserisci un numero");
			numeroUtente = key.nextInt();
		}
		
		System.out.println("Fine");
		*/
		
		int numeroUtente ;
		
		do {
			
			System.out.println("Inserisci");
			numeroUtente = key.nextInt();
			
		} while (numeroUtente >= 0);
		
		
		System.out.println("fine");
		
		
		key.close();
	}
	
	
}
