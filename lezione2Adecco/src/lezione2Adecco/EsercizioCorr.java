package lezione2Adecco;

import java.util.Scanner;

public class EsercizioCorr {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		
		String parola1, parola2;
		parola1 = key.nextLine();
		parola2 = key.nextLine();
		
		
		int lunghezzaParola1 = parola1.length();
		
		if (lunghezzaParola1 > parola2.length()) {
			System.out.println(parola1);

		}

		else {
			System.out.println(parola2);

		}

		key.close();

	}

}
