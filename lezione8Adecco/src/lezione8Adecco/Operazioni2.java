package lezione8Adecco;



/**
 * 
 *  1-Funzione
 *  Creare una funzione che prenda
 *  in input un numero e resituisca
 *  true o false se il numero e' pari
 *  restituisce true altrimenti false.
 *  
 *  
 *  2-Funzione.
 *  Creare una funzione che prenda
 *  in input una Stringa e ritorna
 *  true se la stringa inizia
 *  con una vocale altrimenti false.
 * 
 * 
 * 
 * @author mr
 *
 */

public class Operazioni2 {

	
	public boolean isEven(int numero) {
		return numero % 2 == 0;
	}
	
	
	public boolean isWordStartWithVowel(String parola) {
		
		char firstCharacter = parola.charAt(0);
		
		if(firstCharacter == 'a' || 
				firstCharacter == 'e' ||
				firstCharacter == 'i' ||
				firstCharacter == 'o' ||
				firstCharacter == 'u')
			return true;
		
		return false;
	}
	
	
	
	
	
}