package lezione5Adecco;

import java.util.Scanner;

/**
 * 
 * si prenda in input una stringa
 * usando scanner
 * il programma restituisce
 * il numero di vocali presenti
 * 
 * Es ciao ------> 3
 * 
 * 
 * @author mr
 *
 */


public class Esercizio1 {

	public static void main(String[] args) {
		
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("inserisci ");
		String parolaUtente = key.nextLine();
		
		int quanteVocali = 0;
		int index = 0;
		
		while(index < parolaUtente.length()) {
			
			char myChar = parolaUtente.charAt(index);
			
			if(myChar == 'a' || myChar == 'e' || 
				myChar == 'i' || myChar == 'o'|| myChar == 'u'	) {
				
				quanteVocali++; // quanteVocali +=1 
				//quanteVocali = quanteVocali + 1
				
			}
		
			index++;
		}
		
		System.out.println("ho trovato nella parola "+ parolaUtente);
		System.out.println(quanteVocali + " vocali " );
		
		
		
		key.close();
	}

}
