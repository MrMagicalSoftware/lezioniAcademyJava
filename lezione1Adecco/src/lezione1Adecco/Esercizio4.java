package lezione1Adecco;

import java.util.Scanner;

public class Esercizio4 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		double numero1 , numero2 , numero3, ris ;
		
		System.out.println("inserisci 3 numeri");
		numero1 = key.nextDouble();
		numero2 = key.nextDouble();
		numero3 = key.nextDouble();
		
		
		ris = numero1 * numero2 * numero3;
		
		System.out.println("ris vale " + ris);
		
		key.close();
	}
	
}
