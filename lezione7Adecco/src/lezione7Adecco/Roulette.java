package lezione7Adecco;

import java.util.Random;
import java.util.Scanner;

public class Roulette {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		Random random = new Random();
		
		boolean isGameOn = true;
		
		int cash = 100; // soldi disponibili.
		
		
		while(isGameOn && cash >0 ) {
			
			System.out.println("Quanto vuoi giocare ? $ " + cash);
			int puntata = key.nextInt();
			
			//check -semaforo
			//controllo cash fino
			//continua a richidere perchè
			// posso avere piu' volte l'errore
			while(puntata > cash) {
				System.out.println("non va bene");
				puntata = key.nextInt();
			}
			
			
			System.out.println("SCEGLI UN NUMERO COMPRESO TRA 0 - 10 ");
			//su quale numero voglio giocare
			int numeroSceltoUtente = key.nextInt();
			
			//suppo che la roulette sia 0  - 10
			while(numeroSceltoUtente <0 || numeroSceltoUtente > 10) {
				System.out.println("Devi giocare un numero compreso tra 0 - 10 ");
				numeroSceltoUtente = key.nextInt();
			}
			
			// the game
			
			//estrattore casuale
			int numeroEstratto = random.nextInt(0 , 11); // sceglie un numero tra 0 -10
			System.out.println("NUMERO ESTRATTO ------> " + numeroEstratto) ;
			
			
			//cash += numeroEstratto == numeroSceltoUtente ? puntata * 3 : 0;
			
			cash -= puntata; // scalo i soldi...
			
			
			
			if(numeroEstratto == numeroSceltoUtente) {
				//ho vinto
				System.out.println("woww hai vinto!!!!");
				cash += puntata * 3;  // cash = cash + ( puntata * 3 )
			}
			else {
				System.out.println("non hai vinto");
			}
			
			
			
			System.out.println("Vuoi giocare yes or no");
			
			//uso next() al posto di nextLine
			//per documentazione tecnica
			isGameOn = key.next().equals("yes") ? true : false;
			
			if(cash <= 0) {
				System.out.println("##################################");
				System.out.println("Ma sei un barbone ..... tacccccccc");
				System.out.println("##################################");
			}
			
			
		}
		
		
		
		System.out.println("$ finali -------> " + cash);
		
		
		
		key.close();
	}

}
