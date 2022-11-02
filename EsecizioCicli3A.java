package lezione6Adecco;

import java.util.Scanner;

public class EsecizioCicli3A {

	public static void main(String[] args) {
		
		
		
		Scanner key = new Scanner(System.in);
		
		int somma = 0 ,  numeriInseriti= -1 ;
		int numeroInput ; 
		
		
		do {
			System.out.println("INSERISCI UN NUMERO");
			numeroInput = key.nextInt();
			
			somma += numeroInput;
			numeriInseriti++;
			
			//if(numeroInput != 0 )
			//	numeriInseriti++;
			
		} while (numeroInput != 0);
		
		
		//numeriInseriti--;
		
		System.out.println("###################");
		System.out.println("SOMMA VALE " + somma);
		System.out.println("NUMERI INSERITI " + numeriInseriti);
		System.out.println("###################");
		
		double media = somma /(double) numeriInseriti ;
		
		System.out.println("La media vale " + media);
		
		
		
		
		key.close();
	}

}
