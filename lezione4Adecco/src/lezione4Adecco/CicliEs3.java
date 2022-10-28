package lezione4Adecco;

import java.util.Scanner;

/**
 * 
 * creare un programma che
 * prenda in ingresso ( Scanner)  2 numeri
 * che per nostro comodo sono ordinati
 * ( il primo numero è sempre piu' piccolo 
 * del secondo)
 * 
 * stampare tutti i numeri compresi 
 * 
 * 			2  10 
 * 
 * 
 * 			2 3 4 5 6 7  .. . . 10
 * 
 * 
 * 			> 10 100
 *            10 11  .. . .. . .. 100
 * 
 * 
 * @author mr
 *
 */


public class CicliEs3 {

	public static void main(String[] args) {
	
		Scanner key = new Scanner(System.in);
		
		int numero1 , numero2 ;
		
		
		
		System.out.println("iNSERISCI IL PRIMO NUMERO");
		numero1 = key.nextInt();
		
		System.out.println("Inserisci il secondo numero");
		numero2 = key.nextInt();
		
		while(numero1 <= numero2) {
			
			System.out.print(numero1 + " ");
			numero1++;
		}
		
		
				
		
		key.close();
	}
	
	
	
	
	
	
	
	
	
}
