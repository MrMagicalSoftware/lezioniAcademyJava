package lezione3Adecco;

import java.util.Scanner;

/**
 * 
 * creare un programma che 
 * prenda in ingresso 3 numeri
 * il programma stampi si
 * se tutti e 3 i numeri sono multipli di 5
 * 
 * 	10 20 30 ---> si
 * 
 *  10 20  2 ---> no
 *  
 * 
 * @author mr
 *
 */

public class EsercizioPari {

	public static void main(String[] args) {
	
		
		Scanner key = new Scanner(System.in);
		
		int num1 , num2 , num3;
		
		System.out.println("insert");
		num1 = key.nextInt();
		num2 = key.nextInt();
		num3 = key.nextInt();
		
		String ris = (num1 % 5 == 0 && num2 % 5 == 0 && num3 % 5 == 0 ) ? "ok" : "no";
		
		System.out.println(ris);
			
		key.close();
	}
	
}
