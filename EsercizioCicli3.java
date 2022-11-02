package lezione6Adecco;

import java.util.Scanner;

/**
 * 
 * 
 * Creare un programma
 * che prenda in ingresso 
 * una sequenza di numeri
 * che termina con il valore 0
 * 
 * al termine della sequenza il
 * programma calcola la media aritmetica
 * 
 *   media = sommaTotale / numeroValori
 *   
 *   Nota : potete usare while - oppure do-while
 *   		
 * 
 * 
 * 
 * @author mr
 *
 */
public class EsercizioCicli3 {

	public static void main(String[] args) {
		
		
		/*
		//casting implicito
		int numero = 10;
		double myValue = numero;
		
		
		//casting esp
		
		double myVar = 30.9;
		int valore = (int) myVar;
		
		*/
		
		
		
		Scanner key = new Scanner(System.in);
		
		int somma = 0 ,  numeriInseriti= 0 ;
		
		System.out.println("inserisci");
		int numeroUtente = key.nextInt();
		
		
		while(numeroUtente != 0) {
			
			somma += numeroUtente;
			numeriInseriti++;
			
			System.out.println("inserisci");
			numeroUtente = key.nextInt();
			
		}
		
		System.out.println("###################");
		System.out.println("SOMMA VALE " + somma);
		System.out.println("NUMERI INSERITI " + numeriInseriti);
		System.out.println("###################");
		
		double media = somma /(double) numeriInseriti;
		
		System.out.println("La media vale " + media);
		
		
		key.close();
	}
	
}
