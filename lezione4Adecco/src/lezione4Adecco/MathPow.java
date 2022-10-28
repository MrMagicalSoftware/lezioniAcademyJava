package lezione4Adecco;

import java.util.Scanner;

public class MathPow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(Math.PI);
		
		//Math.pow(BASE, ESPONENTE)
		
		//Math.pow(Math.E / 2, numeroUtente + 1)
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("inserisci");
		int numeroUtente = key.nextInt();
		
		
		/*
		if(numeroUtente != 0 )
			System.out.println(7 / numeroUtente);
		else
			System.out.println("non puoi divi x 0");
		*/
		
		final double R = 5.9972162173721; //COSTANTE DI ROBB
		
		final int PEZZI_IN_CHESS = 32;
		
		
		
		
		double blocco1 = Math.pow(Math.E / 2, numeroUtente + 1);
		double blocco2 = Math.pow(Math.PI / 4 , 3);
		
		double bloccoDenominatore = (2 * Math.PI)  -  ((7 * numeroUtente) / 3) ;  
		
		
		if(bloccoDenominatore != 0) {
			double ris = (  blocco1 * blocco2 )   / bloccoDenominatore;
			System.out.println("calcolo vale " + ris);
		}
		else
			System.out.println("non posso eseguire il calcolo");
		
		
		
		
		key.close();
	}

}
