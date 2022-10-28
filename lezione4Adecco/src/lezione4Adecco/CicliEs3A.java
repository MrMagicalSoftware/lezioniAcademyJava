package lezione4Adecco;

import java.util.Scanner;

public class CicliEs3A {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		int numero1 , numero2;
		int min , max;
		
		
		System.out.println("inserisci numero 1");
		numero1 = key.nextInt();
		System.out.println("inserisci il secondo numero");
		numero2 = key.nextInt();
		
		
		max = numero1 > numero2 ? numero1 : numero2;
		min = numero1 > numero2 ? numero2 : numero1;
//		
		
//		if(numero1 > numero2) {
//			max = numero1;
//			min = numero2;
//		}else {
//			max = numero2;
//			min = numero1;
//		}
		
		
		System.out.println("MIN VALE " + min);
		System.out.println("MAX VALE " + max);

		
		
		while(min <= max) {
			System.out.print(min + " ");
			min++;
		}
		
		
		key.close();
	}
	
}
