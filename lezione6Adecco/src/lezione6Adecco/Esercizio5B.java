package lezione6Adecco;

import java.util.Scanner;

public class Esercizio5B {

	public static void main(String[] args) {

		
		
		

		Scanner key = new Scanner(System.in);
		
		boolean isTheStringOk = true;
		
		System.out.println("Inserisci una parola");
		
		
		String parolaUtente = key.nextLine();
		
		
		int index = 0;
		
		
		
		while(index < parolaUtente.length()) {
			
			//System.out.println(parolaUtente.charAt(index));
			char carattereCorrente = parolaUtente.charAt(index);

			
			if( !( carattereCorrente == 'a' ||
				       carattereCorrente == 'e' ||
				       carattereCorrente == 'i' ||
				       carattereCorrente == 'o' ||
				       carattereCorrente == 'u'))
					isTheStringOk = false;
			
			
			
			index +=2;
		}
		
		
		
		if(isTheStringOk)
			System.out.println("ok");
		else
			System.out.println("no");
		
		
		
		key.close();
		
		
		
	}

}
