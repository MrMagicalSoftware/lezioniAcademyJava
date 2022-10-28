package lezione5Adecco;

import java.util.Scanner;

/**
 * 
 * 
 * 
 *  Scrivere un programma che prenda
 *  in input 2 stringhe.
 *  
 *  se le 2 stringhe hanno dimensione
 *  diversa il programma non puo' eseguire il seguente
 *  calcolo :
 *  
 *  if(parola1.length() != parola2.length() )
 *  	exit(0) 
 *  
 *  
 *  il programma costruire una nuova stringa
 *  nel seguente modo
 *  
 *  		0  1  2  3 
 *  		c  i  a  o
 *  
 *          0  1  2  3
 *          s  o  n  o
 *  
 * 
 * 			coao
 * 
 * 
 * 
 * @author mr
 *
 */


public class Esercizio3 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		String parola1 , parola2;
		
		System.out.println("inserisci la prima parola");
		parola1 = key.nextLine();
		
		System.out.println("inserisci la prima parola");
		parola2 = key.nextLine();

		//sono di lunghezz diverse ??
		if(parola1.length() != parola2.length()) {
			System.out.println("non posso proseguire");
			System.exit(0);
		}
		
		int index = 0;
		String parolaCombinata = "";
		
		while(index < parola1.length()) {
			
			//significa che considero la
			// prima parola
			if(index % 2 == 0)
				parolaCombinata += parola1.charAt(index);
			else 
				//considero la parola2
				parolaCombinata += parola2.charAt(index);
			
			index++;
		}
		
		System.out.println("##################à");
		System.out.println(parolaCombinata);
		
		
		key.close();
	}
	
	
	
	
	
	
	
}
