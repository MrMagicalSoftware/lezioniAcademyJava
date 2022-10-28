package lezione2Adecco;

import java.util.Scanner;

public class EsempioSelezione {

	public static void main(String[] args) {

		
		Scanner key = new Scanner(System.in);
		
		System.out.println("inserisci 2 numeri");
		
		int numero1 , numero2;
		
		
		numero1 = key.nextInt();
		numero2 = key.nextInt();
		
		System.out.println("HAI SCRITTO " + numero1 + " " + numero2);
		

		//  6   > 6  ? false 
		// 4 > 4 ? false
		if(numero1 > numero2) {
			System.out.println("sono nel blocco if");
			System.out.println(numero1);
		}
		else {
			
			System.out.println("sono nel blocco else");
			System.out.println(numero2);
		
		}
		
		
		System.out.println("fine");
		
		
		
		
		key.close();
	}

}
