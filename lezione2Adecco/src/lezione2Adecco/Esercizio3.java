package lezione2Adecco;

import java.util.Scanner;

/**
 * 
 * creare un programma che prenda
 * a tastiera una stringa
 * 
 * stampa a video la stringa
 * e gli index possibili
 * 
 * poi prende un numero intero
 * sempre da tastiera e stampa
 * a video il carattere alla posizione
 * di quel numero
 * 
 * 			Es :  ciao
 * 				
 * 				"ok hai scritto " + ciao 
 *              il range va da 0 a 3
 *              
 *              > inserisci un numero
 *              	1
 *              
 *              > i
 *              
 *              
 *         Es : alabarda
 *         
 *               "ok hai scritto ....   "
 *               il tuo range va 0 a 7
 *               
 *            >inserisci un numero 
 *            7
 *            
 *            a
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


public class Esercizio3 {

	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("inserisci una stringa");
		
		String parolaUtente = key.nextLine();
		
		System.out.println("hai scritto " + parolaUtente);
		
		
		int range = parolaUtente.length() -1 ;
		
		
		System.out.println("il tuo range va da 0 a  " + range);
		System.out.println("il tuo range va da 0 a  " +  (parolaUtente.length() -1 )    );

		
		
		System.out.println("inserisci un numero");
		
		int numeroUtente = key.nextInt();
		
		char myChar = parolaUtente.charAt(numeroUtente);
		System.out.println("hai selezionato " + myChar);
		
		
		System.out.println("hai selezionato " + parolaUtente.charAt(numeroUtente));

		
		//     5 posti 
		// 36 * 36 * 36 * 36 * 36 
		
		
		
		key.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
