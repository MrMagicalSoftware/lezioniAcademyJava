package lezione10Adecco;

import java.util.Random;

public class Starter {
	
	public static void main(String[] args) {
		
		
		Random random = new Random();

		
		
		
		Book[] insiemeBooks = new Book[10];
		
		for (int i = 0; i < insiemeBooks.length; i++) {
			System.out.println(i + " " + insiemeBooks[i]);
		}
		
		System.out.println("##############################");
		
		for (int i = 0; i < insiemeBooks.length; i++) {
			
			
		
//			Book bookTempBook = new Book(random.nextInt(500));		
//			insiemeBooks[i] = bookTempBook;

			insiemeBooks[i] = new Book(random.nextInt(500));	
		}
		
		//stampa
		for (int i = 0; i < insiemeBooks.length; i++) {
			System.out.println(i + " " + insiemeBooks[i]);
		}
		
		
		Book maxBook = insiemeBooks[0];
		System.out.println("PARTENZA -----> " + maxBook);
		
		
		for(int i = 1 ; i < insiemeBooks.length ; i++) {
			if(insiemeBooks[i].getNumeroPagine() > maxBook.getNumeroPagine() ) {
				maxBook = insiemeBooks[i];
			}
		}
		
		System.out.println("LIBRO MAX   ------> " + maxBook);
		
		
		
		
		
	}
	

}
