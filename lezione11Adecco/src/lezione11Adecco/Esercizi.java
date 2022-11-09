package lezione11Adecco;

/***
 * 
 * 1 - Creare una funzione che 
 * 	   prenda in input un vettore
 *     di interi e ritorna il numero
 *     di elementi dispari.
 *     
 *     Es  ([10 , 5 , 15 , 7 ) ------> 3
 * 
 * 
 * 2 - Creare una funzione che 
 *     prende in input un vettore
 *     di interi e un numero
 *     e ritorna un intero
 *     che rappresenta quanti numeri
 *     sono maggiori di quel numero
 *     
 *     Es ( [10 , 4 , 6 , 18 ] , 12 ) ----> 3
 * 
 * 
 * 
 * 3 - Creare una funzione che prenda
 *     un numero intero e ritorna 
 *     un numero che rappresenta tutti i suoi 
 *     divisori  
 *     
 *     Es ( 10 ) ----> 4
 *     i divisori di 10 sono 1 - 2 - 5 - 10
 * 
 * 
 * 4- Creare una funzione che prenda in ingresso
 * 	  un vettore di stringhe e ritorna un vettore
 *    di stringhe salvando nel vettore solo le stringhe+
 *    che hanno >= 3 lunghezza.
 *    
 *    
 *    
 *    (["ciao", "mi" , "he" , "hello"]) -----------> (out---> ["ciao", "hello"])
 * 
 * 
 * 
 * 
 * @author mr
 *
 */





public class Esercizi {
	
	
	
	
	
	
	
	public int contaElementiDispari(int[] elementi ) {

		int contaDispari = 0;
		
		for(int i : elementi) {
			if(i % 2 != 0 )
				contaDispari++;
		}
		
		return contaDispari;
	}
	
	
	
	
	public int contaElementiDispari2(int[] elementi ) {

		int contaDispari = 0;
		
		for(int i = 0 ; i < elementi.length;i++) {
			if(elementi[i] % 2 != 0 )
				contaDispari++;
		}
		
		return contaDispari;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int somma(int n1 , int n2) {
		return n1+ n2;
	}
	
	
	
	
//	public int sommaElementiVett(int[] vett) {
//		
//	}
//	
	
	
	
	
	

}
