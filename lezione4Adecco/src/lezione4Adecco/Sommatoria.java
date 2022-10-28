package lezione4Adecco;

import java.util.Scanner;

/**
 * 
 * 
 *  CREARE UN PROGRAMMA
 *  CHE PRENDA IN INGRESSO
 *  UN NUMERO DA TASTIERA
 *  E CALCOLA LA SOMMA 
 *  CHE VA DA 1 FINO AL NUMERO INSERITO
 *  
 *  ES :    8
 *  
 *          1 + 2 + 3 + 4 +5+ 6+ 7+ 8
 *          
 *          
 *          ES : 
 *          
 *          3
 *          
 *          1 + 2+ 3 ====>  6 
 *          
 * 
 * 
 * @author mr
 *
 */
public class Sommatoria {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		System.out.println("inserisci ");
		int numeroUtente = key.nextInt(); // 3
		
		int index = 1 ;
		int somma = 0;
		
		/*
		 * 
		 * somma = 0 + 1 => 1
		 * somma = 1 + 2 => 3
		 * somma = 3 + 3 => 6 
		 * 
		 */
		
		while(index <= numeroUtente) {
			System.out.print(index + " + ");
			System.out.println("LA SOMMA TOTALE VALE " + somma);

			somma = somma + index ; // somma += index;
			
			index++;
		}
		
		//System.out.println("LA SOMMA TOTALE VALE " + somma);
		
		
		
		
		
		
		
		
		
		key.close();
	}
	
	
}
