package lezione3Adecco;

import java.util.Scanner;

public class Esercizio2 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * 	3 numeri da tastiera
		 *  di tipo intero
		 *  
		 *  stabilire se i 3 numeri sono tutti uguali
		 *  
		 *  
		 *  // OPERATORI LOGICI AND E OR    &&    || 
		 * 
		 * 
		 * 
		 */
		
		Scanner key = new Scanner(System.in);
		
		int numero1 , numero2 , numero3;
		
		System.out.println("insert");
		numero1 = key.nextInt();
		numero2 = key.nextInt();
		numero3 = key.nextInt();
		
		if(numero1 == numero2) {
		
			if (numero1 == numero3) {
				System.out.println("i numeri sono uguali");
			} else {
				System.out.println("SONO DIVERSI");
			}
			
		}
		else {
			System.out.println("Sono diversi");
		}
		
		
		
	
		
		
		
		
		
		
		key.close();
	}
	
}
