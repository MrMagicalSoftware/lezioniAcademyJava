package lezione4Adecco;

import java.util.Scanner;

public class EsCorr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * creare un prenda in ingresso 2 numeri per nostro comodo sono ordinati
		 * stampare tutti i numeri nel mezzo.
		 */
		Scanner key = new Scanner(System.in);
		System.out.println("inserisci due numeri il primo minore del secondo");
		int num1= key.nextInt();
		int num2= key.nextInt();
		key.close();
		
		System.out.println();
		
		while (num1 <= num2) {
			System.out.println(num1);
			num1 +=1;
		}
		
		// 10  20 
		
		// 21 20 
		
		
			
	}
	
}
