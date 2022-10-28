package lezione1Adecco;


/**
 * 
 * CREARE UN PROGRAMMA CHE CREI 2 VAR
 * DI TIPO INTERO CON DEI VALORI.
 * 
 * IL PROGRAMMA STAMPA A VIDEO
 * TUTTE LE OPERAZIONI   
 * 
 * 		+ - *  / 
 * 
 *   numero1 = 
 *   numero2 = 
 * 
 * 
 * @author mr
 *
 */


public class Starter4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero1 = 10;
		int numero2 = 20;
		
		int somma , moltiplicazione , divisione , sottrazione;
		
		somma = numero1 + numero2;
		moltiplicazione = numero1 * numero2;
		divisione = numero1 / numero2;
		sottrazione = numero1 - numero2;
		
		
		System.out.println("la somma tra " + numero1 + " +  " + numero2 + " = " + somma);
		System.out.println("la diffe tra " + numero1 + " " + numero2 + " " + sottrazione);
		System.out.println("DIVISIONE VALE " + divisione);
		System.out.println("");
		
		
		System.out.println("la diffrenza tra " + numero1+ "e " + numero2 + " " + (numero1 - numero2));

	}

}
