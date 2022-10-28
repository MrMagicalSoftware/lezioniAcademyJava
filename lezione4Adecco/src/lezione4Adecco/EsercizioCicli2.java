package lezione4Adecco;

public class EsercizioCicli2 {

	
	/*
	 * creare un programma
	 * che stampa tutti i numeri
	 * che sono pari nel range
	 * che va da 40 a 60 
	 * estremi inclusi 
	 * 
	 * 40 42 44 46  .. . .. . . 60 
	 * 
	 * 
	 * 
	 */
	
	
	
	public static void main(String[] args) {
		
		
		int index = 40;
		
		
//		while(index <= 60) {
//			
//			// 0 == 0 
//			if(index % 2  == 0 )
//				System.out.println(index);
//			
//			index++;
//		}
		
		
//		while(index <= 60) {
//			System.out.println(index);
//			index += 2;
//		}
		
		
		while(index <= 60) {
			
			String risString =  index % 2 == 0 ?  Integer.toString(index)  : " ";
			System.out.print(risString);
			
			index++;
		}
		
		
		
		
	}
	
}
