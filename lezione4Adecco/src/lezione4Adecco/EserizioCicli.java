package lezione4Adecco;

public class EserizioCicli {

	public static void main(String[] args) {
		
		int index = 20;
		int cont = 0;
		
		/*
		 * 		20 21 22 23 24 
		 *      25 26 27 28 29
		 *      30 31  . .. ..
		 *      
		 * 
		 */
		
		
		while(index <= 60) {
			System.out.print(index + " ");
			cont++;
			
			if(cont == 5) {
				System.out.println();
				cont = 0;
			}
			

			index++;
		}
		
		
	}
	
}
