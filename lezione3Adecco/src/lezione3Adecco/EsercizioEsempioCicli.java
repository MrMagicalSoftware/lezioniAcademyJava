package lezione3Adecco;

public class EsercizioEsempioCicli {

	public static void main(String[] args) {
		
		
		
		int index = 0;
		
		
		while(index <= 100 ) {
			System.out.print(index + " ");
			index++; 
			
			if(index % 6 == 0)
				System.out.println();
			// index = index +1
			// index += 1
		}
		
		
		System.out.println("fine");
	}

}
