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
 *     
 *     nel seguente modo : 
 *     
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
 * @author mr
 *
 */





public class Esercizi {
	
	
	/*
	 *    { 10 , 8 , 77 } , 20 
	 * 
	 *     
	 *    20 > 10 
	 *    20 > 8 
	 *    20 > 77 
	 * 
	 * 
	 */
	
	
	/**
	 * 
	 * 		100
	 * 
	 * 
	 *      1 -----------------100
	 *      
	 *      n 
	 *      
	 *      1 ..................n
	 * 
	 * 
	 * 				10
	 *       1-----------10/2 ---->    
	 * 
	 *       100
	 *       |--------------> 50 
	 *       
	 *       
	 *       15 
	 *       
	 *       1 - 3-5 -15
	 *       
	 * 
	 * 
	 * 
	 * @param numero
	 * @return
	 */
	public int quantiDivisori(int numero) {
		
		int contaDivisori = 1;
		
		for(int i = 1 ; i <= numero/2 ; i++)
			if(numero % i == 0) {
				System.out.println("divisore " + i);
				contaDivisori++;
			}
		
		return contaDivisori;
	}
	
	
	
	
	
	//     out 								
	public int contaNumeriMaggioriInVector(int[] vett , int numero) {
		
		int contaElementi = 0;
		

		for(int i= 0 ; i < vett.length ; i++)
			if(vett[i] < numero)
				contaElementi++;
		
//		for(int element : vett)
//			if(numero > element)
//				contaElementi++;

		
		
		return contaElementi;
	}
	
	
	
	
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
	
	
	
	
	
	
	
	
	/*
	
		  Creare una funzione che prenda in ingresso
	 * 	  un vettore di stringhe e ritorna un vettore
	 *    di stringhe salvando nel vettore solo le stringhe+
	 *    che hanno >= 3 lunghezza.
	 *    
	 *    
	 *    
	 *    (["ciao", "mi" , "he" , "hello"])
	 *     -----------> (out---> ["ciao", "hello"])
	
		
		{"ciao" ,"miao" , "gatto" , "g"} 
	
	
	*/
	
	
	public String[] salvaParole(String[] parole) {
		
		String[] risVett = new String[parole.length];
		
		for(int i = 0 , j= 0 ; i < parole.length; i++) {
			
			if(parole[i].length()   >= 3 ) {
				
				risVett[j] = parole[i];
				j++;
			}
				
		}
		
		return risVett;
	}
	
	
	
	
	
	
	
	public int somma(int n1 , int n2) {
		return n1+ n2;
	}
	
	
	
	
//	public int sommaElementiVett(int[] vett) {
//		
//	}
//	
	
	
	
	
	

}
