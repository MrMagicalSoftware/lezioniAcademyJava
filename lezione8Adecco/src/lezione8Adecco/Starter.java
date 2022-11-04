package lezione8Adecco;

import java.util.Scanner;

public class Starter {

	public static void main(String[] args) {

		
		/*
		Scanner key = new Scanner(System.in);
		Persona persona1 = new Persona();
	
		System.out.println("inseirsci il nome");
		persona1.nome = key.next();
		
		System.out.println("eta??");
		persona1.eta = key.nextInt();
		
		System.out.println(persona1.nome);
		System.out.println(persona1.eta);
		*/
		
		
		Cane cane = new Cane();
		
		int i = 0 ;
		
		while(i < 10 ) {
			cane.bark();
			i++;
		}
		
		
		
		
		
		//key.close();
	}

}
