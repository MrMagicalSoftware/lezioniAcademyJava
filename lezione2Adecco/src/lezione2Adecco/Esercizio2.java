package lezione2Adecco;

import java.util.Scanner;

public class Esercizio2 {

	public static void main(String[] args) {
		   Scanner tastiera = new Scanner(System.in);

           System.out.println("Dimmi qualcosa e premi invio (2 volte): ");
           String frase0 = tastiera.nextLine().trim();
           String frase1 = tastiera.nextLine().trim();

           System.out.println("\nHai scritto frasi lunghe " + frase0.length() + " e " + frase1.length() + " caratteri.");

           System.out.println("\nLe prime lettere sono " + frase0.charAt(0) + " e " + frase1.charAt(0) + "\n");

           System.out.println("Urlate sono:\n" + frase0.toUpperCase() + "\n" + frase1.toUpperCase());

          
           
           
           tastiera.close();

	}
	
}
