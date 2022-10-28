package lezione3Adecco;

/**
 * creare un programma
 * che stampa i numeri al contrario
 * 
 * 10 9 8 7 ... .. .. 1 
 * 
 * 
 * @author mr
 *
 */

public class Esercizio7 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.out.println("############");
		int index = 660;
		
		
		while(index >= 1) {
			Thread.sleep(500);
			System.out.println(index);
			index--;
		}
		
		
	}
	
}
