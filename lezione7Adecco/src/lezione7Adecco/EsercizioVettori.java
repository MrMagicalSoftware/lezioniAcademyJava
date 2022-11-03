package lezione7Adecco;

public class EsercizioVettori {

	public static void main(String[] args) {
		
		//int temp1 , temp2 , temp3 , temp4;
		
		// VETTORE === ARRAY 
		
		//tipoVettore[] nomeVettore =new  tipoVettore[DIMENSIONE];
		
		int[] vettInt = new int[10];
		
		//System.out.println(  vettInt[9]     );
		//System.out.println(  vettInt[8]     );

		
		int index = 0 ;
		
		vettInt[0] = 8;
		vettInt[1] = 16;
		vettInt[10] = 24;

		
		
		while(index < vettInt.length) {
			
			System.out.println(  vettInt[index]  );
			
			index++;
		}
		
		
		
		
		
		
	}

}
