package lezione7Adecco;

/**
 *                       0   1   2    3
 * 
 * Esercizio : vett = { 11 , 2 , 40 , 50 }
 * 
 * sommare solamente gli elementi che si trovano
 * in posizione pari
 * 			
 * 				11 + 40 ----> 51
 * 
 * 			
 * 
 * 
 * @author mr
 *
 */



public class EsercizioFor5 {

	public static void main(String[] args) {
		
		int[] vett = { 11 , 2 , 40 , 50 };
		
		int somma = 0;
		
		for (int i = 0; i < vett.length; i+=2) {
			somma += vett[i];
		}
		
		System.out.println(somma);
		
		
		
	}
	
	
}
