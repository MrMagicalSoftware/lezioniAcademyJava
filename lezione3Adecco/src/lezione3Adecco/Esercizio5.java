package lezione3Adecco;

import java.util.Scanner;

/**
 * 
 *  Inseriti tre numeri A, B e C 
 *  dire se B è compreso tra A e C.
 * 
 * 	es : 10 20 30 ---> si 
 * 
 * 		<=	X <= 
 * 
 * @author mr
 *
 */


public class Esercizio5 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		
		
		System.out.println("insert");
		int numero1 = key.nextInt();
		int numero2 = key.nextInt();
		int numero3 = key.nextInt();
		key.close();
	
		
		if(numero1 <=  numero2  && numero2 <= numero3)
			System.out.println("ok");
		else 
			System.out.println("no");
		
		
		
	}
	
	
	
	
}
