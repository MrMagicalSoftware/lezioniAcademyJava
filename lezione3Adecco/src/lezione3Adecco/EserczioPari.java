package lezione3Adecco;

import java.util.Scanner;

public class EserczioPari {

	public static void main(String[] args) {
		
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("insert");
		int numeroUtente = key.nextInt();
		
		
		String risp   = numeroUtente % 2 != 0 ?  "dispari": "pari";
		String risp2  = numeroUtente % 2 == 0 ?  "pari": "dispari";

		if(numeroUtente % 2 == 0) {
			System.out.println("pari");
			
		}else {
			System.out.println("dispari");
		}
		
		
		System.out.println("################");
		System.out.println(risp);
		System.out.println(risp2);

		
		
		
		key.close();
	}
	
	
	
}
