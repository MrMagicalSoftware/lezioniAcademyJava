package lezione8Adecco;

import java.util.Scanner;

public class StarterOp2 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		Operazioni2 operazioni2 = new Operazioni2();
		
		boolean loopOn = true;
		
		do {
			
			System.out.println("Inserisci un numero");
			int numeroUtente = key.nextInt();
			
			
			if(  operazioni2.isEven(numeroUtente) )
				System.out.println("numero pari");
			else
				System.out.println("numero dispari");

			
			System.out.println("y per continuare");
			loopOn = key.next().equals("y") ? true  : false;
			
		} while (loopOn);
		
		
		key.close();

	}

}
