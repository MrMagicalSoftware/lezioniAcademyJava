package lezione2Adecco;

import java.util.Scanner;

public class Conversione {

	public static void main(String[] args) {

		
		Scanner key = new Scanner(System.in);
		
		
		System.out.println("inserisci un numero");
		int minuti = key.nextInt();
		
		if(minuti < 0 ) {
			System.out.println("Errore valore negativo");
		}
		else {

			int secondi = minuti * 60;
			System.out.println("MINUTI " + minuti + "" +  " secondi " + secondi);
		
		}
		
		
		key.close();
	}

}
