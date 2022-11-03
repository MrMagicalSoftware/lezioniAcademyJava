package lezione7Adecco;

/***
 * 
 * 
 * dato un vettore
 * 
 *     { 10 , 50 , 60 , 2 }
 *     
 *     stampare al contrario il vettore
 *     con un ciclo..
 *     
 *     2 60 50 10 
 * 
 * 
 * @author mr
 *
 */


public class EsercizioFor4 {

	public static void main(String[] args) {
		
		
		int[] vett = {  10 , 50 , 60 , 2 };
		
		
		for(int i = vett.length - 1 ; i >= 0 ; i--)
			System.out.print(vett[i] + " ");
		
		
	}
	
	
}
