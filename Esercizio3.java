package lezione6Adecco;

import java.util.Scanner;

/**
 * 
 * data una sequenza di numeri
 * che termina quando si inserisce un 
 * valore maggiore di 20 .
 * 
 * al termine della sequenza
 * il programma stampa se tutti i numeri
 * inseriti sono multipli di 3
 * 
 * 
 * Es :   3 3 6 12 22 ----> yes
 *        3 3 5 21 ----> no
 * 
 * @author mr
 *
 */


public class Esercizio3 {

	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		int numeroUtente;
		boolean sonoTuttiMultipliDi3 = true;
		
		do {
			
			
			System.out.println("inserisci ");
			numeroUtente = key.nextInt();
			
			if(numeroUtente % 3 != 0  && numeroUtente <= 20  )
				sonoTuttiMultipliDi3 = false;
			
		} while (numeroUtente <= 20 );
		
		
		if(sonoTuttiMultipliDi3 )
			System.out.println("ok sono tutti mul");
		else 
			System.out.println("no");
			
		
		
		
		key.close();
	}
	
}
