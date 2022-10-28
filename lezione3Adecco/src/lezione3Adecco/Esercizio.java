package lezione3Adecco;

import java.util.Scanner;

public class Esercizio {
	
	
	public static void main(String[] args) {
	
		/*
		 * 
		 * 	
		 * 
		 * 
		 */
		
		//OPERATORE DI RESTO
		// MODULO
		
		//    % 
		
		// 10 % 2 ===> 0 
		
		//   % MODULO E' IL RESTO DELLA DIVISIONE
		
		//  10 : 2 = 5 CON RESTO    (0 MODULO ) 
		
		// 10 % 3 ---> 10 : 3 = 3 CON RESTO 1 
		
		
		/*
		 * 
		 *     CONFRONTO 
		 *     
		 *     >
		 *     <
		 *     >=
		 *     <=
		 *     
		 *     ==  UGUALE DI CONFRONTO
		 * 
		 * 	   !=  DIVERSO
		 * 
		 * 
		 * 
		 */
		
		
		Scanner key = new Scanner(System.in);
		
		int numero1 , numero2;
		
		System.out.println("inserisci");
		numero1 = key.nextInt();
		numero2 = key.nextInt();
		
		if(numero1 == numero2) {
			System.out.println("i numeri sono uguali");
		}
		else {
			System.out.println("sono diversi");
		}
		
		
		String ris = numero1 == numero2 ? "sono uguali " : "sono div";
		
		
		// oggiPiove ? "take the umbrella" : "be happy";
		
		System.out.println(ris);
		
	
		
		
		key.close();
	}
	
}
