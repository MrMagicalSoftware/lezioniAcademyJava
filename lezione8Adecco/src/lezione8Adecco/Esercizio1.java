package lezione8Adecco;

public class Esercizio1 {

	
	public static void main(String[] args) {
		
		String[] vettString = {"ciao" , "ala" , "ciao"};
		
		int cont = 0 ;
		
		for (int i = 0; i < vettString.length; i++) {
		
			String tempString = vettString[i];
			
			if(tempString.charAt(0) == 'a')
				cont++;
			
		}
		
		
		System.out.println("numero di parole che iniziano con a " + cont);
		
		
		
	}
	
	
	
	
}
