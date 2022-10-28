package lezione4Adecco;

import java.util.Scanner;

/**
 * 
 * 
 * si prenda in una stringa
 * con il metodo nextLine()
 * 
 * si stampi a video una nuova stringa
 * che e' fatta solamente dalle vocali 
 * ( a ,e  i o u )
 * 
 *  0123
 *  ciao -------> [] ------> iao 
 *
 *  alabarda -----> [] ----> aaaa
 * 
 * @author mr
 *
 */

public class EserzioCicli4 {

	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("inserisci");
		String parolaInput = key.nextLine();
		
		String nuovaParola = "";
		int index = 0;
		
		while (index < parolaInput.length()) {
			
			char carattereCorrente = parolaInput.charAt(index);
			
			if(carattereCorrente == 'a' || carattereCorrente == 'e' ||
					carattereCorrente == 'i' || carattereCorrente == 'o' ||
					carattereCorrente == 'u') {
				nuovaParola += carattereCorrente; // nuovaParola = nuovaParola + carattere
			}
			
			index++;
		} // fine while
		
		
		
		System.out.println(nuovaParola);
		
		
		key.close();
	}
	
	
	
}
