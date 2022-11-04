package lezione8Adecco;

import java.io.InterruptedIOException;
import java.util.Iterator;
import java.util.Random;

public class Operazioni {
	
	
	//input ----> 2 numeri
	//out----> la somma int
	
	
	public int somma(int numero1 , int numero2) {
		int somma = numero1 + numero2;
		return somma;
	}
	
	
	//input----> numero intero 
	//out -----> int 
	
	// 3 --->f -----> 6
	
	public int radd(int numero) {
		
		return numero * 2;
	}
	
	
	//data in  input string
	//out---> numero di caratteri della stringa
	
	public int calcolaCaratteri(String paroString) {
		
		return paroString.length();
	}
	
	
	//2 numeri interi input
	//ritorna il numero piu' grande )int
	
	
	public int numeroMaggiore(int numero1 , int numero2) {
		
		if(numero1 > numero2)
			return numero1;
		else 
			return numero2;
		
	}
	
	
	/**
	 * 
	 * @param numero1
	 * @param numero2
	 * @return
	 */
	
	public int numeroMaggiore2(int numero1 , int numero2) {
		return numero1 > numero2 ? numero1 : numero2;
	}
	
	public int lanciaDado() {
		Random random  = new Random();
		
		int numeroGenerato = random.nextInt(6) + 1;
		
		return numeroGenerato;
	}
	
	
	
	
	
	
	/**
	 * 
	 * Questa funzione prende in input
	 * una stringa e un numero e mi ripete 
	 * la stringa tante volte quanto e' il numero
	 * inserito
	 * (ciao , 3 ) ____----> ciao ciao ciao
	 * 
	 * @param parola
	 * @param numeroDiVolte
	 * @return
	 */
	public String ripetiParola(String parola , int numeroDiVolte) {
		
		String ris = "";
		
		for(int i = 0; i < numeroDiVolte ; i++)
			ris += parola;
		
		
		return ris;
	}
	
	

}
