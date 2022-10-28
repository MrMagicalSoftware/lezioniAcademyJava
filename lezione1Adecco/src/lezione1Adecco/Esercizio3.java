package lezione1Adecco;

import java.util.Scanner;

public class Esercizio3 {

	public static void main(String[] args) {

		
		Scanner keyboard  = new Scanner(System.in);
		
		
		
		System.out.println("inserisci 2 numeri");
		
		int numero1 = keyboard.nextInt();
		
		
		int numero2 = keyboard.nextInt();
		keyboard.close();
		
		System.out.println("numero ---> " + numero1 + " " + numero2);
		
		
	}

}
