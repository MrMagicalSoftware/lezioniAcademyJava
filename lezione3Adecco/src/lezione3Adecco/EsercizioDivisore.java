package lezione3Adecco;

import java.util.Scanner;

/*
 * 2 numeri da tastiera di tipo int
 * dire il secondo numero e' un divisore del primo
 * 
 * Es    10 e 2 ---> ok
 * 		 
 *       5   e 3 ---> no 
 *       
 *       nota : potreste aver bisogno del modulo %
 * 
 * 
 */

public class EsercizioDivisore {

	public static void main(String[] args) {
		
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci 2 numeri");
		int numeroUtente1 = key.nextInt();
		int numeroUtente2 = key.nextInt();

		
		System.out.println("################");

		if(numeroUtente1 % numeroUtente2 == 0) {
			System.out.println("ok");
		}
		else {
			System.out.println("no");
		}
		
		
		System.out.println("#################");
		
		
		
		
		String risString = numeroUtente1 % numeroUtente2 == 0 ? "ok" : "no";
		
		System.out.println("------> " + risString);
		
		
		
		
		
		key.close();
	}

}
