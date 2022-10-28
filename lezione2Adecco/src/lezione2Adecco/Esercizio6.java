package lezione2Adecco;

import java.util.Scanner;

public class Esercizio6 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String word;
		int  userNumber;

		
		System.out.println("Inserisci una parola ");
		word = keyboard.nextLine();

		System.out.println(word.length() - 1);

		System.out.println("Inserisci un numero intero");
		userNumber = keyboard.nextInt();

		
		System.out.println(word.charAt(userNumber));

		keyboard.close();
	}
	
}
