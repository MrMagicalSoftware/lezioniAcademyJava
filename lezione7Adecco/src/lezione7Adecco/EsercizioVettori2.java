package lezione7Adecco;



/**
 * 
 * 	creare un programma 
 *  che prenda un numero che sia 
 *  compreso tra 3  e 10 estremi inclusi
 *  (semaforo)
 *  
 *  il numero che viene inserito mi
 *  determina la grandezza del vettore.
 *  
 *  riempire il vettore con lo scanner
 *  elemento per elemento
 *  
 *  stampare il vettore.
 * 		
 * 
 *  Es grandezza 3
 *  
 *         vett[0] <==== utente
 * 		   vett[1] <==== utente
 * 		   vett[2] <==== utente
 * 
 * 
 */



import java.util.Scanner;
public class EsercizioVettori2 {

	public static void main(String[] args) {
		
		
		
	
		Scanner key = new Scanner(System.in);
		
		
		int numeroUtente;
		
		//semaforo
		
		do {
			System.out.println("inserisci ");
			numeroUtente = key.nextInt();
		} while (numeroUtente > 10 || numeroUtente < 3);
		
		int[] vettInt = new int[numeroUtente];
		
		System.out.println("hai creato un vettore di grandezza " + vettInt.length);
		
		
		int index = 0 ;
		
		
		while(index < vettInt.length) {
			System.out.println("inserisci");
			vettInt[index] = key.nextInt();	
			index++;
		}
		
		
		index = 0 ;
		System.out.println("##################");
		
		while(index < vettInt.length) {
			
			System.out.println(vettInt[index]);
			index++;
		}
		
		/**
		 * 
		 * 
		 *           Blocco1        blocco2            blocco3
		 * 
		 * 		for(         ;                     ;           ){
		 * 
		 * 			istruzioni
		 * 
		 *      }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
		
		
		key.close();
		
		
	}
	
	
	
	
}
