package lezione8Adecco;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

/***
 * 
 * 
 * 1- Dato un ingresso ( SCANNER) 
 *    un numero che deve != 0
 *    (controllare con un semaforo)
 *    
 *    e dato un vettore di double gia'
 *    inizializzato.
 *    
 *    modificare il vettore moltiplicando
 *    tutti gli elementi del vettore
 *    per il numero inserito.
 *    
 *    
 *    3   { 3.1 , 4.2  . .. . .. }
 *        { (3 * 3.1 ) , ( 3 * 4.2 )  . .. . .
 * 
 * 
 * 
 * 2 - ESERCIZIO 2 .
 * 		Dati 2 vettori che hanno la stessa dimensione
 *     (i vettori sono gia' inizializzati )
 *     
 *     controllare che la dimensione dei 2 vettori sia 
 *     uguale con if.
 *     
 *     creare un terzo array che ha la seguente forma :
 *     
 *     
 *     [    1  ,  4 ,  5 ]
 *    
 *     [    3 ,   1  , 5 ]
 *     
 *     
 *     [    4 , 5 , 10 ]
 *     Terzo vettore somma   
 *  
 * 
 * 
 * 
 * 3- Esercizio 3 . 
 * 	  Dato un vettore già 
 *    inizializzato  { 4 , 8 , 12 }
 * 		
 *    e un numero in input con Scanner 
 *    
 *    determinare se il numero inserito
 *    e' presente all'interno del vettore
 *    
 *    
 *    Versione2 :
 *    
 *    la versione 2 parte da un vettore
 *    di stringhe {"mario" , "luigi" , "ciro" }
 *    
 *    e un nome in input ( Scanner )
 *    
 *    il programma stampa si se il nome 
 *    è presente del vettore 
 *    
 *    attenzione ( per le stringhe si usa equals ) 
 * 
 * 
 * 
 * @author mr
 *
 */


public class Esercizio2 {

	public static void main(String[] args) {
		
		
		Scanner key = new Scanner(System.in);
		Random random  = new Random();
		DecimalFormat df = new DecimalFormat("0,00");
		
		
		
		int  numeroUtente ;
		
		do {
			
			System.out.println("inserisci un numero != 0 ");
			numeroUtente = key.nextInt();
			
		} while (numeroUtente == 0 );
		
		
		
		double[] vettDouble = new double[10];
		
		for (int i = 0; i < vettDouble.length; i++) {
			vettDouble[i] = random.nextDouble(100) ; // 0 -99
			System.out.println("Stampo il numero " + (i + 1) + " : " +    vettDouble[i]);
			
			vettDouble[i] *= numeroUtente;
			

			vettDouble[i] =  Double.valueOf(    df.format(vettDouble[i])    );	      
			System.out.println("Stampo il numero " + (i + 1) + " : " +    vettDouble[i]);

			
			System.out.println("##################");
		}
		
		
		
		
		
		key.close();
	}
	
	
}















