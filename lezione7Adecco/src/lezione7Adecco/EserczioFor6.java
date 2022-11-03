package lezione7Adecco;

import java.util.Scanner;

/**
 * 
 * 		Esempio
 * 
 * 		dato un vettore gia'
 *      inizializzato  
 *      
 *      vett = { 10 , 30 , 5 , 2}
 *      
 *      e un numero in input con 
 *      Scanner.
 *      
 *      Determinare quanti numeri 
 *      sono multipli del numero inserito
 *      
 *      Es : input ( 5 ) 
 *      
 *      ------------>   3 
 * 
 * 
 * 
 * @author mr
 *
 */


public class EserczioFor6 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("inserisci un numero");
		int numero = key.nextInt();
		
		int[] vett = { 10 , 30 , 5 , 2};
		
		int cont = 0;
		
		for (int i = 0; i < vett.length; i++) {
			if(vett[i] % numero == 0)
				cont++;
		}
		
		System.out.println(cont);
		
		
		key.close();
	}
	
	
	
	
	
	
	
}