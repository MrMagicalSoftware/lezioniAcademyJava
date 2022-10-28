package lezione5Adecco;

import java.util.Scanner;

public class EsercizioString {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in); 
		
		
		System.out.println("inserisci una stringa");
		String ris  = key.nextLine();
		 
		/*      
		 *  
		 *      ____
		 * 		ciao
		 * 
		 *      index = 0 
		 *      
		 *      0 < 4  
		 *      1 < 4
		 *      2 < 4
		 *      3 < 4
		 *      
		 *      4 < 4 false
		 * 
		 */
		
		int index = 0;
		String myRisString = "";
		
		
		while(index < ris.length()  ) {
			
			char myChar = ris.charAt(index);
			// charAt(0)  charAt(1) chart(2) charAt(3) 
	
			if(myChar  == 'a' || myChar == 'e' ||
				myChar == 'i' || myChar == 'o' ||
				myChar == 'u') {
				
				//System.out.print(myChar + "");
				myRisString += myChar; // myRisString = myRisString + myChar
			}
			
			System.out.println(myRisString);
			
			index++;
		}
		
		//iao
		System.out.println();
		System.out.println();
		
		System.out.println("#################################");
		
		System.out.println(myRisString);
		
		System.out.println("#################################");

		
		key.close();
	}

}
