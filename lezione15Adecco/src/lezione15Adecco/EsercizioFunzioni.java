package lezione15Adecco;

import java.util.ArrayList;

public class EsercizioFunzioni {

	
	// true  false false
	
	
	
	
	public boolean isMaggioriSuperiori(boolean[] vett) {
		
		
		int contaTrue = 0 , contaFalse = 0 ;
		
		for (boolean bool : vett) {
			if(bool)
				contaTrue++;
			else
				contaFalse++;
		}
				
		return contaTrue >= contaFalse ? true: false;
	}
	
	
	
	public int contaCaratteriTotali(ArrayList<String> arr) {
	
		int somma = 0;
		
		for(String elemento : arr)
			somma += elemento.length();
		
//		for(int i = 0 ; i < arr.size() ; i++)
//			somma += arr.get(i).length();
		
		
		return somma;
	}
	
	
	
	
	
	
	
	
}
