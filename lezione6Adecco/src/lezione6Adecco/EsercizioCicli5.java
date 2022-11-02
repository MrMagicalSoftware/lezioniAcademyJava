package lezione6Adecco;

import java.util.Scanner;

/**
 * 
 * 
 * Data una stringa in input
 * verificare se nelle posizioni
 * pari della stringa e' contenuta
 * uan vocale.
 * 
 *       
 *       0 1 2 3
 *       
 *       c i a o  -------> no 
 * 
 *       
 *       0 1 2 3 4
 * 
 * 		 a l u r a -------> si
 * 
 * 
 * @author mr
 *
 */

public class EsercizioCicli5 {

	public static void main(String[] args) {
		
		
		Scanner key = new Scanner(System.in);
		
		boolean isTheStringOk = true;
		
		System.out.println("Inserisci una parola");
		
		
		String parolaUtente = key.nextLine();
		
		
		int index = 0;
		
		
		
		while(index  < parolaUtente.length()) {
			
			char carattereCorrente = parolaUtente.charAt(index);
			
			if(index % 2 == 0) {
				
				if( !( carattereCorrente == 'a' ||
				       carattereCorrente == 'e' ||
				       carattereCorrente == 'i' ||
				       carattereCorrente == 'o' ||
				       carattereCorrente == 'u'))
					isTheStringOk = false;
				
			}
			
			index++;
		}
		
		
		
		if(isTheStringOk)
			System.out.println("ok");
		else
			System.out.println("no");
		
		
		key.close();
	}
	
}
