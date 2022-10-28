package lezione2Adecco;

import java.util.Scanner;

/**
 * 
 * Creare un programma che
 * prenda da tastiera
 * 2 stringhe,
 * il programma stampa a video
 * la stringa piu' grande
 * 
 * Se le due stringhe hanno 
 * la stessa dimensione
 * stampa a video la prima inserita
 * 
 * 	ciao
 *  miao
 *  
 *  
 *  ------> ciao
 *  
 *  
 *  ala
 *  ci
 *  
 *  ------->  ala
 *  
 * 
 * 		>= 
 *      <=
 *      >
 *      <
 *      !=
 *      == 
 *      
 * 
 * 
 * @author mr
 *
 */

public class EsercizioStringhe {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		
		System.out.println("inserisci 2 stringhe");
		
		String parola1 , parola2;
		
		parola1 = key.nextLine();
		parola2 = key.nextLine();
		
		
		if(parola1.length() >= parola2.length()) {
			System.out.println("PAROLA PIU GRANDE");
			System.out.println(parola1);
		}
		else {
			System.out.println("#######");
			System.out.println(parola2);
		}
		
		
		
		key.close();
	}

	
	
	
	
	
}
