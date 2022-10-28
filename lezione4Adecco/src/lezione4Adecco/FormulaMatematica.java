package lezione4Adecco;

import java.util.Scanner;

public class FormulaMatematica {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("inserisci");
		int numeroUtente = key.nextInt();
		
		if(numeroUtente < 1) {
			System.out.println("Non posso calcolare");
			System.exit(0);
		}
		
		System.err.println("########################");
		System.out.println("CALCOLO  .. . ...");
		
		
		
		double blocco1 = (2 * Math.PI * Math.E) / 7 ;
		
		double blocco2 = Math.sqrt(5 * Math.PI);
		
		
		double risultato =( blocco1 + blocco2 + numeroUtente ) 
							/ ( 9 * Math.E);
		
		
		System.out.println(risultato);
		
		key.close();
	}
	
}
