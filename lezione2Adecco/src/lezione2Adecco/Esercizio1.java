package lezione2Adecco;

import java.util.Scanner;

/**
 * 
 * Creare un progr che prenda in input 2 stringhe utilizzando la tastiera ( nota
 * : esiste un metodo che si chiama nextLine() )
 * 
 * stampare a video la grandezza delle 2 string stampare a video il primo
 * carattere delle due stringhe
 * 
 * stampare a video tutte stringa tutta in maiuscolo. how to
 * 
 * ciao miao
 * 
 * 4 4 c m CIAO MIAO
 * 
 * 
 * 
 * 
 * 
 * @author mr
 *
 */

public class Esercizio1 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		String text1, text2;

		

		System.out.println("Inserisci 2 parole");

		text1 = key.nextLine();
		text2 = key.nextLine();

		System.out.println("####################");
		System.out.println("ok hai scritto " + text1 + " " + text2);
		System.out.println("####################");

		
		System.out.println("CARATTERI : " + text1 + " sono " +text1.length());
		System.out.println("CARATTERI : " + text2 + " sono " +text2.length());
		
		System.out.println(text1.charAt(0) + "\n" + text2.charAt(0));
		
		System.out.println(text1.toUpperCase());
		System.out.println(text2.toUpperCase());
		
		
		key.close();
	}

}
