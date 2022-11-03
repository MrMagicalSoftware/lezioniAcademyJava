package lezione7Adecco;


/***
 * 
 * 
 * 
 *  dato un vettore
 *  gia' inizializz  
 *  
 *      int[] vett = { 2 , 4 ,18  }  -----> SI
 *      
 *      int[] vett = { 2 , 1 ,18  }  ----> NO
 *      
 *      stampare la scritta
 *      
 *      "contiene tutti elementi pari"
 *      se il vettore contiene tutti elementi pari
 *      
 *      altrimenti 
 *      dire che non tutti gli elmenti sono pari
 * 
 * 
 * 		Nota : USARE IL BREAK IN CHECK!!
 * 
 * 
 * @author mr
 *
 */

public class EserzioArray1 {

	public static void main(String[] args) {
		

		boolean isAllNumberEven = true;
		
		
		int[] vett = {  4 , 20 ,1,  50 , 100 , 77 , 100 , 300 };
		
		
		for (int i = 0; i < vett.length; i++) {
			
			System.out.println("sto considerando l'elemnto " + vett[i]  );
			
			if(vett[i] % 2 != 0 ) {
				isAllNumberEven = false;
				//break;
			}
				
		}
		
		
		if(isAllNumberEven)
			System.out.println("sono tutti pari");
		else
			System.out.println("no");
		
		
		
	}

}
