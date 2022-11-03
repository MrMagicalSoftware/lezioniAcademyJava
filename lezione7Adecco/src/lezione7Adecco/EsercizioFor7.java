package lezione7Adecco;


/**
 * 
 *   dato un vettore
 *   di boolean 
 *   contare quanti valori
 *   false e quanti true 
 *   sono presenti
 *   
 * 
 * @author mr
 *
 */


public class EsercizioFor7 {

	
	public static void main(String[] args) {
		
		boolean[] vettBoolean = {true, false,true};
		
		
		int contaTrue = 0; 
		int contaFalse = 0; 

		
		for (int i = 0; i < vettBoolean.length; i++) {
			if(vettBoolean[i])
				contaTrue++;
			else
				contaFalse++;
		}
		
		
		System.out.println("numero di true --> " + contaTrue);
		System.out.println("numero di false --> " + contaFalse);

		
		
		
		
		
	}
	
}
