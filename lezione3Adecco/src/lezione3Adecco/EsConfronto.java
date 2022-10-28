package lezione3Adecco;

import java.util.Scanner;

public class EsConfronto {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("caccia 3 numeri: ");
		int primoNumero = scan.nextInt();
		int seccondoNumero = scan.nextInt();
		int terzoNumero = scan.nextInt();
		scan.close();

		int bigG = primoNumero;

		// verifica se sono uguali 
		if (bigG == seccondoNumero && bigG == terzoNumero) {
			System.out.println("Sono uguali!!");
		} else {
			// trovare piu grande
			if (bigG < seccondoNumero)
				bigG = seccondoNumero;
			
			if (terzoNumero > bigG)
				bigG = terzoNumero;
			
			System.out.println("il piu grande e: " + bigG);
		}
		
		
		// 10 20 30 
		
		//bigG = 30 
		
	}
	
	
}
