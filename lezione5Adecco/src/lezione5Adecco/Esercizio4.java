package lezione5Adecco;

import java.util.Scanner;

/**
 * 
 * Si prenda in ingresso 
 * una stringa con Scanner
 * si creii una nuovaStringa
 * reversed
 * 
 *  	ciao ---> oaic
 *  
 *     
 *     
 * 
 * 
 * 
 * @author mr
 *
 */

public class Esercizio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("inserisci una parola");
		
		String parolaUtente = key.nextLine();
		
		int index = parolaUtente.length() -1 ;
		
		//System.out.println(parolaUtente.charAt(index));
		
		String parolaReversed = "";
		
		
		while(index >= 0 ) {
			parolaReversed += parolaUtente.charAt(index);
			// parolaReversed = parolaReversed + parolaUtente.charAt(index);
			index--;
		}
		
		System.out.println("#################################");
		System.out.println("PAROLA " + parolaUtente);
		System.out.println("PAROLA reverse " + parolaReversed);
		System.out.println("#################################");

		
		
		key.close();
	}

}
