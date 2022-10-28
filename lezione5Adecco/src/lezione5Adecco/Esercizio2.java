package lezione5Adecco;

import java.util.Scanner;

/**
 * 
 * PRENDERE INPUT UNA STRINGA
 * E STAMPARE A VIDEO SOLO LE POSIZIONI PARI 
 * DELLA PAROLA 
 * 
 *          0  1  2   3
 *  		c  i  a   o 		
 *  
 *  		
 *  		c a
 *  
 *        
 *  
 *  
 *  
 *  
 * 
 * @author mr
 *
 */

public class Esercizio2 {
	
	
	public static void main(String[] args) {
		
		
		Scanner key = new Scanner(System.in);
		
		
		System.out.println("inserisci una stringa");
		String parola = key.nextLine();
		
		
		int index = 0 ;
		
		String nuovaParolaString ="";

		
		/**
		 *   0  1  2  3   4
		 *   c  i  a  o
		 * 
		 *   ca
		 * 
		 * 
		 */
		
		while(index < parola.length()) {
			
			System.out.print(parola.charAt(index));
			//nuovaParolaString += parola.charAt(index);
			index += 2;
			
		}
		
		
		//posso risolvere usando una condizione if
		//con il modulo
		
	//	http://marketplace.eclipse.org/marketplace-client-intro?mpc_install=5012014
//		while(index < parola.length()) {
//			
//			if(index % 2 == 0) {
//				//System.out.print(parola.charAt(index));
//				nuovaParolaString += parola.charAt(index);
//			}	
//			
//			index++;
//		}
//		
//		System.out.println(nuovaParolaString);
//		
		
		
		
		
		
		key.close();
	
	
	}
	
	
	
	
	
	
	

}
