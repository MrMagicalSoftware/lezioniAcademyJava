package lezione3Adecco;

import java.util.Scanner;

/*
 * 
 * Creare un programma 
 * che prenda in ingresso
 * 3 interi e ritorna
 * il numero piu' grande
 * 
 * 
 * 		Es : 10 
 *            8 
 *           40 
 *           
 *           ------> 40 
 * 	
 * 
 */

public class Esercizio4 {

	public static void main(String[] args) {
		
		/**
		 * 
		 * 	if(condizione1){
		 * 
		 *  } else if(condizione2 ) {
		 *  
		 *  } else if(condizione3){
		 *  
		 *  
		 *  } else{
		 *  
		 *  }
		 * 
		 * 
		 */
		
		
		Scanner key = new Scanner(System.in);
		
		
		int numero1 , numero2 , numero3;
		
		System.out.println("inserisci");
		
		numero1 = key.nextInt();
		numero2 = key.nextInt();
		numero3 = key.nextInt();
		
		if(numero1 == numero2 && numero2 == numero3)
			System.out.println("i numeri sono uguali ");
		
		else if(numero1 >= numero2 && numero1 >= numero3) {
			System.out.println(numero1);
		} else if(numero2 >= numero1 && numero2 >= numero3) {
			System.out.println(numero2);
		} else {
			System.out.println(numero3);
		}
		
		
		
		
		
		key.close();
	}
	
}
