package lezione3Adecco;

import java.util.Scanner;

public class Ripasso {

	public static void main(String[] args) {
		
		/*
		 * 
		 *  if( condizioneBooleana ) {
		 *  	
		 *  	//istruzioni1
		 *  	//istruzione2
		 *  	//istruzione3
		 *  
		 *  }
		 *  
		 * 
		 * 
		 * 
		 */
		
		//Creare un programma che prenda
		//in input un numero intero (int)
		// da tastiera
		// il programma stampa a video
		//se la persona puo' prendere-conseguire
		//la patente.
		
		// in italia la patente si prende se ho 18 
		
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci la tua età ");
		
		int eta = key.nextInt();
		int anniMancanti = 0 ;
		
		
		if(eta >= 18 ) {
			System.out.println("ok possiamo iniziare");
		}
		else {
			anniMancanti = 18 - eta;
			System.out.println("non puoi ancora ti mancano " + anniMancanti + " anni ");
		}
		
		System.out.println(anniMancanti);
		
		
		
		int myVar = 88;
		
		{
			
			System.out.println(myVar);
			int u = 9;
			
			{
				System.out.println(u);
			}
			
		}
		
		//System.out.println(u);
		
		key.close();
	}
	
	
}
