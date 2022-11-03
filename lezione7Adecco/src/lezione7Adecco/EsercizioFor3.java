package lezione7Adecco;

/**
 * 
 * 
 *  dato un vettore di elementi gia'
 *  inizializz 
 *  
 *  int[] vett = { 10 , 50 , 100 , 1 , 4 }
 *  
 *  trovare l'elemento piu' grande del vettore.
 *  
 *  quindi stampa 100.
 *  
 *  
 * 
 * 
 * 
 * @author mr
 *
 */


public class EsercizioFor3 {

	public static void main(String[] args) {

		int[] vett = { 10 , 50 , 100 , 1 , 4 };
		
		int max = vett[0];
		
		
		for (int i = 0; i < vett.length; i++) {
		
			if(vett[i] > max) {
				max = vett[i];
			}
			
		}
		
		
		System.out.println(max);
	
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
}
