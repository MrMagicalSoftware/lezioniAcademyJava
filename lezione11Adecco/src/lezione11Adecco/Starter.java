package lezione11Adecco;

public class Starter {

	
	public static void main(String[] args) {
		
		Esercizi esercizi = new Esercizi();
		
		
		int[] myVett = { 10 , 3 , 5 };
		
		int ris = esercizi.contaElementiDispari(myVett);
	
		System.out.println(ris);
	
		System.out.println("###############à");
		
		
		int ris2 = esercizi.contaNumeriMaggioriInVector(myVett, 7);
		
		System.out.println(ris2);
	
		
		System.out.println("Conta divisiori");
		int numeroDivisori = esercizi.quantiDivisori(10);
		
		System.out.println(numeroDivisori);
		
		
		System.out.println("Esercizio 4");
		
		String[] myStringVett = {"ciao" ,"miao" ,"g" , "gatto"};
		
		String[] vettRiStrings=  esercizi.salvaParole(myStringVett);
		
		
		//System.out.println(vettRiStrings); // mi stampa una scritta
		
		for(String eString : vettRiStrings) 
			if(eString != null)
				System.out.println(eString);
		
		System.out.println();
		
		//versione ottim
		for(String eString : vettRiStrings) {
			if(eString == null)
				break;
			
			System.out.println(eString);
		}
		
	}
	
	
}
