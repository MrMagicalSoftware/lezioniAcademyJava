package lezione6Adecco;

import java.util.Scanner;

/**
 *   	Dato un numero in ingresso
 *   	che viene passato come una stringa
 *      dire se  il numero è un multiplo di 3
 *      (facendo la somma e poi applicando il modulo ).
 * 
 * 
 * 
 * @author mr
 *
 */



public class MultipliDi3 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci un numero");
		
		String numeroUtente = key.nextLine();
		
		int index = 0;
		int somma = 0;
		
		while(index < numeroUtente.length()) {
			//System.out.print(numeroUtente.charAt(index) + " ");
			
			//Integer.parseInt(myString);
			
			int tempNumero = Integer.parseInt(numeroUtente.charAt(index) + "");
			//System.out.println(tempNumero);
			
			somma += tempNumero; // somma = somma + tempNumero
			
			index++;
		}
		
		
		if(somma % 3 == 0 )
			System.out.println("multiplo di 3");
		else 
			System.err.println("no multiplo ");
		
		
		key.close();
	}
	
	
}
